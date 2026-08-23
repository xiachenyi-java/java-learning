package com.example2.demo2.service;

import com.example2.demo2.common.JwtUtil;
import com.example2.demo2.common.UserContext;
import com.example2.demo2.dto.LoginDTO;
import com.example2.demo2.dto.UserContextDTO;
import com.example2.demo2.dto.UserRegisterDTO;
import com.example2.demo2.entity.User;
import com.example2.demo2.repository.UserRepository;
import com.example2.demo2.vo.LoginVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 夏辰义
 * 2026/8/2015:36
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final JwtUtil jwtUtil;

    public User register(UserRegisterDTO dto){
        if (userRepository.findByUsername(dto.getUsername()).isPresent()){
            throw new RuntimeException("用户名已存在");
        }
        log.info("注册用户: username={}",dto.getUsername());

        //创建实体
        User user = new User();
        user.setRole("USER");
        user.setUsername(dto.getUsername());

        //加密密码
        String hashed =bCryptPasswordEncoder.encode(dto.getPassword());
        user.setPasswordHash(hashed);

        return userRepository.save(user);
    }

    public LoginVO login(LoginDTO dto){
        //账号是否存在
        if (userRepository.findByUsername(dto.getUsername()).isEmpty()){
            throw new RuntimeException("用户名或密码错误");
        }
        User user = userRepository.findByUsername(dto.getUsername()).orElse(null);

        //密码是否正确
        if (!(bCryptPasswordEncoder.matches(dto.getPassword(), user.getPasswordHash()))){

            throw new RuntimeException("用户名或密码错误");
        }
        //生成token
        String token = jwtUtil.generateToken(user.getId(), user.getUsername(),user.getRole());
        //清除敏感信息
        user.setPasswordHash(null);
        // 创建 LoginVO，塞入 token 和 userInfo
        LoginVO loginVO = new LoginVO();
        loginVO.setToken(token);
        loginVO.setUserInfo(user);
        return loginVO;
    }

    //获取当前用户
    public User getCurrentUser(){
        UserContextDTO user = UserContext.getUser();
        if (user.getUserId() == null){
            throw new RuntimeException("用户未登录");
        }
        return userRepository.findById(user.getUserId()).orElseThrow(()
                -> new RuntimeException("用户不存在"));
    }

}
