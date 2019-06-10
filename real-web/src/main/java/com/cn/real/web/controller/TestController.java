package com.cn.real.web.controller;


import com.cn.service.ITestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 黄勇
 * @CreateTime 2019/6/10 9:57
 **/
@RestController
public class TestController {
    @Resource
    private ITestService testService;

    @GetMapping("/test")
    public String test(){
       return testService.test();
    }
}
