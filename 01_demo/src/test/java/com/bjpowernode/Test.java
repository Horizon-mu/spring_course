package com.bjpowernode;

import com.bjpowernode.service.Impl.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testDoSome1(){
        SomeServiceImpl someServiceImpl = new SomeServiceImpl();
        someServiceImpl.doSome();
    }
    @org.junit.Test
    public void testDoSome2(){
        //使用spring 容器创建的对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器，通过这个容器就可以获取Java对象了
        //ClassPathXmlApplicationContext(config)表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中拿到需要的对象
        //getBean("someService") 括号里面的值是spring配置文件里的id值
        SomeServiceImpl someService =(SomeServiceImpl) ac.getBean("someService");
        someService.doSome();
        String s = (String) ac.getBean("string1");
        System.out.println(s.length());

    }
}
