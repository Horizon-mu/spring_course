package com.bjpowernode;

import com.bjpowernode.da02.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @org.junit.Test
    public void test02() {
        String config = "da02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("student");
        System.out.println(myStudent);
        System.out.println(ac.getBeanDefinitionCount());
    }
}
