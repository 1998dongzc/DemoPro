package com.example.demo.controller;

import com.example.demo.exception.DataException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.crypto.Data;

@ControllerAdvice
public class TestController {

    @ExceptionHandler
    public ModelAndView doTest(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("error");
        mv.addObject("mess",ex.getMessage());
        System.out.println(1111+"报错");
        return mv;
    }
}
