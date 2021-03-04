package com.bjpowernode.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    @Test
    public void myTest04(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        com.bjpowernode.ba04.Student myStudent = (com.bjpowernode.ba04.Student) applicationContext.getBean("student2");
        System.out.println(myStudent);
    }
}
