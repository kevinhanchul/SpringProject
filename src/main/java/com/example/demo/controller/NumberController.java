package com.example.demo.controller;

import com.example.demo.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @PostMapping
    public String saveNumber(@RequestParam int number) {
        numberService.saveNumber(number);
        return "숫자가 성공적으로 저장되었습니다.";
    }
}
