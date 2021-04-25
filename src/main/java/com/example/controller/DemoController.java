package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @RequestMapping("aaa")
    public String Demo1() {
        System.out.println("进入aaa");
        return "view/t3.html";
    }

    @RequestMapping("bb")
    @ResponseBody
    public String Demo2() {
        System.out.println("进入bb+");
        return "进入bb+";
    }

}
