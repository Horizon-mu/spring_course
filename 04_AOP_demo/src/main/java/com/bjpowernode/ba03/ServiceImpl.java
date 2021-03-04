package com.bjpowernode.ba03;

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

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("====doFirst方法执行了====");
        return "hrz";
    }
}
