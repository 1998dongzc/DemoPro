package com.example.demo.controller;

import com.example.demo.exception.DataException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DemoController {

    public int a=1;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println(1/0);
        return "测试数据";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public int doTest(){
        a++;
        return a;
    }

    @RequestMapping("/test2")
    public void doTest1(HttpServletRequest request){
    }

}
