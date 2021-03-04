package com.bjpowernode.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "student1")
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
     *
     */
    @Autowired
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
