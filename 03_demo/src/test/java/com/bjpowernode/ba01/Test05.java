package com.bjpowernode.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    @Test
    public void myTest05(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        com.bjpowernode.ba05.Student myStudent = (com.bjpowernode.ba05.Student) applicationContext.getBean("student3");
        System.out.println(myStudent);
    }
}
