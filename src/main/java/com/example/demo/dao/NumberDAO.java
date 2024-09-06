package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NumberDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 숫자를 DB에 저장하는 메서드
    public void saveNumber(int number) {
        String sql = "INSERT INTO numbers (number) VALUES (?)";
        jdbcTemplate.update(sql, number);
    }
}
