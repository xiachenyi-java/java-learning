package com.example2.demo2.controller;

import com.example2.demo2.common.Result;
import com.example2.demo2.dto.UserRegisterDTO;
import com.example2.demo2.entity.User;
import com.example2.demo2.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 夏辰义
 * 2026/8/2018:14
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Tag(name = "用户管理")
public class UserController {
    private final UserService userService;

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    public Result<User> register(@RequestBody @Valid UserRegisterDTO dto){
        return Result.success(userService.register(dto));
    }
}
