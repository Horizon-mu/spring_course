package com.bjpowernode.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "student2")
public class Student {
    @Value("李思")
    private String name;
    @Value("22")
    private int age;
    /**
     * @Autowired spring 框架提供的注解，实现引用类型的赋值
     * spring中通过注解给类型赋值，使用的是自动注入的原理
     * 支持byName byType(默认)。
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     *       2.在set方法上面
     * 属性：required boolean类型，默认为true
     *      required = true 表示引用类型赋值失败，程序报错并终止执行
     *      required = false 表示引用类型如果赋值失败，程序正常执行，赋值为null
     *
     *
     * 使用byNAme方式
     *  步骤：1.在属性上面加@Autowired
     *       2.在属性上面加@Qualifier(value = "bean的id"),表示使用指定名称的bean
     *
     */
    @Autowired(required = false)
    @Qualifier(value = "school")
    private School school;

    public void setName(String name) {
        System.out.println("name"+name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("age"+age);
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
