package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 숫자를 DB에 저장하는 메서드
    public void findUserInfo(int UserInfo) {
        String sql = "select from t_user_info";
        jdbcTemplate.update(sql, UserInfo);
    }
}
