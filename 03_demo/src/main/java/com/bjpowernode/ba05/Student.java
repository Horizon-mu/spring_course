package com.bjpowernode.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component(value = "student3")
public class Student {
    @Value("李思")
    private String name;
    @Value("22")
    private int age;
    /**
     * 引用类型
     * @Resource 来自于JDK的注解 spring 框架提供了对该注解的功能支持，可以使用它来给引用类型
     *      赋值，它使用的是自动注入原理，支持byName(默认) byType
     * 位置：1.在属性上面，无需set方法，推荐
     *      2.在set方法上面
     *
     */

    private School school;

    public void setName(String name) {
        System.out.println("name"+name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("age"+age);
        this.age = age;
    }
@Resource
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
    public void print(){
        List<School> list = new ArrayList<>();
        list.remove(school);

    }
}
