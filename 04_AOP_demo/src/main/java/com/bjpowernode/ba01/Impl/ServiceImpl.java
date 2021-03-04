package com.bjpowernode.ba01.Impl;

import com.bjpowernode.ba01.Service;

public class ServiceImpl implements Service {

    @Override
    public void doService(Integer x, String z) {
        System.out.println("====doService 方法执行了====");
    }
}
