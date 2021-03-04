package com.bjpowernode.ba03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class Aspect_demo {
    /**
     * 环绕通知方法的定义格式
     * 1.public
     * 2.必须有返回值，推荐使用Object
     * 3.方法名称自定义
     * 4.方法有固定参数：ProceedingJoinPoint
     */
    @Around(value = "execution(* *..ServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //实现环绕通知
        //1. 目标方法的调用
        Object result = null;
        System.out.println("环绕通知：在目标方法之前====当前时间："+ new Date());
        Object[] args = proceedingJoinPoint.getArgs();
        if(args != null && args.length > 1){
            String str = (String) args[0];
            if("zhangsan".equals(str)){
                result = proceedingJoinPoint.proceed();//等同于method.invoke();
                result = "Hello AspectJ AOP";
            }
        }
        //2.在目标方法的前或者后 加入功能
        System.out.println("环绕通知：在目标方法之后，提交事务");
        /*System.out.println("方法名称=="+joinPoint.getSignature().getName());*/
        return result;
    }
}
