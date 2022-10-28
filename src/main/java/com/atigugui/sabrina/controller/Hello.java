package com.atigugui.sabrina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Sabrina Liu
 * @version 1.0
 * @date 2022/10/26 10:49
 */
@Controller
@RequestMapping("/hello")
public class Hello {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }
}
