package com.bjpowernode.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void myTest01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student myStudent =(Student) applicationContext.getBean("myStudent");
        System.out.println(myStudent);
        System.out.println(applicationContext.getBeanDefinitionCount());
        String[] str = applicationContext.getBeanDefinitionNames();
        for (String s :  str){
            System.out.println("容器中对象的名字：" + s);
        }
    }
}
