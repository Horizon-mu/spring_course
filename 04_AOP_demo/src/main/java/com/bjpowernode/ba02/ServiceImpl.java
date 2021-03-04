package com.bjpowernode.ba02;

import com.bjpowernode.ba02.Service;
import org.aspectj.lang.JoinPoint;

public class ServiceImpl implements Service {

    @Override
    public void doService(Integer x, String z) {
        System.out.println("====doService 方法执行了====");
    }

    @Override
    public String doOthers(String name, String age) {
        System.out.println("====doOthers方法执行了====");
        return "abcd";
    }
}
