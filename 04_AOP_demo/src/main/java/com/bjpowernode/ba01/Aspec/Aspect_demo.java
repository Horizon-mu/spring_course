package com.bjpowernode.ba01.Aspec;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Aspect : 是 aspectj框架的注解，表明当前类是切面类
 */
@Aspect
public class Aspect_demo {
    /**
     *
     * @Before 前置通知
     *  属性：value 切入点表达式，表示切面执行的位置
     *  位置：方法的定义上面
     * @param joinPoint
     */
    @Before(value = "execution(public void com.bjpowernode.ba01.Impl.ServiceImpl.doService(Integer, String))")
    public void printTime(JoinPoint joinPoint){
        System.out.println("doService()方法定义：" + joinPoint.getSignature());
        System.out.println("方法的名称：" + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            System.out.println("参数=" + arg);
        }
        System.out.println("当前时间"+ new Date());
    }
}
