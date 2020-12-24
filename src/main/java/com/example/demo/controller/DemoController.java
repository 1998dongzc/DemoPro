package com.example.demo.controller;

import com.example.demo.config.TestAnnotation;
import com.example.demo.model.User;
import com.example.demo.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Api(tags = "这是一个测试的controller")
@Controller
public class DemoController {

    @Autowired
    private TestService service;

    @ApiOperation("测试接口")
    @GetMapping("/test")
    @ResponseBody
    public User test(@ApiParam(name = "对象id",value = "1",required = true) @NonNull Integer id){
        return service.getUser(id);
    }

    @GetMapping("/test1")
    @ResponseBody
    public int doTest(){
        return 1;
    }

    @GetMapping("/test2")
    public void doTest1(HttpServletRequest request){
    }

    @ApiOperation("返回一个User对象")
    @GetMapping("/test3")
    public @ResponseBody User doTest3(){
        return new User(1,"dzc","男");
    }

}
