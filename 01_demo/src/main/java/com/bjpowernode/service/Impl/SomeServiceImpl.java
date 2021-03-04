package com.bjpowernode.service.Impl;

import com.bjpowernode.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl的doSome方法！！");
    }

    public SomeServiceImpl() {
        System.out.println("构造方法执行了！！");
    }
}
