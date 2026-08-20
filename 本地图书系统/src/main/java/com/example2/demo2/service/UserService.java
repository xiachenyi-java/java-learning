package com.example2.demo2.service;

import com.example2.demo2.dto.UserRegisterDTO;
import com.example2.demo2.entity.User;
import com.example2.demo2.repository.UserRepository;
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

    public User register(UserRegisterDTO dto){
        if (userRepository.findByUsername(dto.getUsername()).isPresent()){
            throw new RuntimeException("用户名已存在");
        }
        log.info("注册用户: username={}",dto.getUsername());

        //创建实体
        User user = new User();
        user.setUsername(dto.getUsername());

        //加密密码
        String hashed =bCryptPasswordEncoder.encode(dto.getPassword());
        user.setPasswordHash(hashed);

        return userRepository.save(user);
    }
}
