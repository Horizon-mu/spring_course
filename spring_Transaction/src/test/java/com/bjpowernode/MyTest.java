package com.bjpowernode;

import com.bjpowernode.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/10/11/21:29
 * @Description:
 */
public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容器中获取service对象
        BuyGoodsService service = (BuyGoodsService) applicationContext.getBean("buyService");
        System.out.println("service是代理" + service.getClass().getName());
        //service是代理com.sun.proxy.$Proxy14
        //调用方法
        service.buy(1001,10); 
    }
}
