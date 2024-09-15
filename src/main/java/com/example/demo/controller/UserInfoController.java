package com.example.demo.controller;

import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService UserInfoService;

    @PostMapping
    public String findUserInfo(@RequestParam int UserInfo) {
        UserInfoService.findUserInfo(UserInfo);
        return "정보가 성공적으로 조회되었습니다.";
    }
}
