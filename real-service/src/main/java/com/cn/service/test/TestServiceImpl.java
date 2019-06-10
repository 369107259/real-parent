package com.cn.service.test;

import com.cn.api.test.ITestService;
import org.springframework.stereotype.Service;

/**
 * @Author 黄勇
 * @CreateTime 2019/6/10 9:58
 **/
@Service
public class TestServiceImpl implements ITestService {

    public String test() {
        return "这个是spring注入测试";
    }
}
