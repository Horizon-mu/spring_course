package com.bjpowernode;

import com.bjpowernode.ba02.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Service serviceImpl = (Service) applicationContext.getBean("serviceImpl");
        serviceImpl.doService(1,"sj");
        serviceImpl.doOthers("jdi","jdi");
    }
}
