package com.bjpowernode;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void test01(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int res = ac.getBeanDefinitionCount();
        System.out.println("容器中对象的数量:"+res);
        String[] str = ac.getBeanDefinitionNames();
        for (String s: str) {
            System.out.println("容器中对象名称："+s.toString());
        }
    }
}
