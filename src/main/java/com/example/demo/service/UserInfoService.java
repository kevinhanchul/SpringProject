package com.example.demo.service;

import com.example.demo.dao.UserInfoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoDAO UserInfoDAO;

    public void findUserInfo(int UserInfo) {
        UserInfoDAO.findUserInfo(UserInfo);
    }
}
