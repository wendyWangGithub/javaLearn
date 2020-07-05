package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoWiredUse {

    public void testMethod() {
        System.out.println("测试Autowired成功...");
    }

}
