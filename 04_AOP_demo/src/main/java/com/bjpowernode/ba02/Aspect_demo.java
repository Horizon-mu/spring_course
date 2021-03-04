package com.bjpowernode.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class Aspect_demo {

    @AfterReturning(value = "execution(* *..ServiceImpl.do*(..))",returning = "res")
    public void myAfterReturning(Object res){
        System.out.println("后置通知：在目标方法之后执行,获取到的返回值是 "+res);
    }
}
