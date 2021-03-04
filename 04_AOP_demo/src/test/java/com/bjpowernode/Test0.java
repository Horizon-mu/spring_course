package com.bjpowernode;

import com.bjpowernode.ba03.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test0 {
    @Test
    public void test(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Service serviceImpl = (Service) applicationContext.getBean("serviceImpl");
        String str = serviceImpl.doFirst("zhangsan",123);
        System.out.println(str);
    }
}
