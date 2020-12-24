package com.example.demo.service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public User getUser(Integer id) {
        
        try {
            return testMapper.selectById(id);
        } catch (Exception e) {
            log.error("出现了未知的错误"+e.getMessage());
        }
        return null;
    }

}
