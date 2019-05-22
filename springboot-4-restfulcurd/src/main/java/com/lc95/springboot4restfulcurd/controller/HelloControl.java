package com.lc95.springboot4restfulcurd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloControl {

    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
