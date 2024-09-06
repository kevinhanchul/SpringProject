package com.example.demo.service;

import com.example.demo.dao.NumberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    @Autowired
    private NumberDAO numberDAO;

    public void saveNumber(int number) {
        numberDAO.saveNumber(number);
    }
}
