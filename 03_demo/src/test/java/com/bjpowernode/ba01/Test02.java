package com.bjpowernode.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

    @Test
    public void myTest02(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        com.bjpowernode.ba02.Student myStudent = (com.bjpowernode.ba02.Student) applicationContext.getBean("student");
        System.out.println(myStudent);
    }


}
