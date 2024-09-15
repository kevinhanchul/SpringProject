package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class UserInfoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer userInfo;
    
    public UserInfoEntity() {
    }

    public UserInfoEntity(Integer userInfo) {
        this.userInfo = userInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(Integer userInfo) {
        this.userInfo = userInfo;
    }
}
