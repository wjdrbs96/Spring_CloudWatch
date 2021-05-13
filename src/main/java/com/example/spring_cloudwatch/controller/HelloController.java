package com.example.spring_cloudwatch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/05/11
 */
@Slf4j
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        log.error("에러입니다!");
        return "hello";
    }
}

