package com.test.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.test.spring.AutoWiredUse;
import org.springframework.stereotype.Controller;

@Controller
public class AutowiredTest {

    @Autowired
    public AutoWiredUse awu;

    @Test
    public void testPrint(){
        awu.testMethod();
    }

}
