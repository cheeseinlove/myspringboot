package com.controller;

/**
 * Created by 讯 on 2017/3/30.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }
}