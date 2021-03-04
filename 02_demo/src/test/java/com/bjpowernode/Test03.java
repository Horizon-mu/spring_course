package com.bjpowernode;

import com.bjpowernode.da03.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    @org.junit.Test
    public void test03() {
        String config = "da03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("student");
        System.out.println(myStudent);
    }
}
