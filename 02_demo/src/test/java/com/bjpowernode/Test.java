package com.bjpowernode;

import com.bjpowernode.da01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test01() {
        String config = "da01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("student");
        System.out.println(myStudent);
        System.out.println(ac.getBeanDefinitionCount());
    }
}

