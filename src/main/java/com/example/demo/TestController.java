package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: kangcd
 * @Date: 2019/4/9 14:52
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "hello spring boot";
    }
}
