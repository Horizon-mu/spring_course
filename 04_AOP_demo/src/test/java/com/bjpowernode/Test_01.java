package com.bjpowernode;
import com.bjpowernode.ba01.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_01 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Service serviceImpl = (Service) applicationContext.getBean("serviceImpl");
        serviceImpl.doService(1,"hrz");
    }
}
