package com.ahuan.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description <What does this class do>
 * @DATE 2020/12/10 15:39
 * @Author ahuan
 * @ProjectName jenkinsdemo
 * @Email a1875884755@gmail.com
 * @Version 1.0
 */
@Controller
@RequestMapping("/hello")
public class Hello {

    @RequestMapping(value = "/oo",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "你好啊，我是HELLO WORLD!";
    }
}
