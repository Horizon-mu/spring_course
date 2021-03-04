package com.bjpowernode.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Value 简单类型的属性赋值
 *      属性：value 是String类型的，表示简单类型的属性值
 *      value 可以省略
 *      位置：1.在属性的上方，无需set方法，推荐使用
 *           2.在set方法上面
 *
 */
@Component(value = "student")
public class Student {
    @Value("张飒")
    private String name;
    @Value("23")
    private int age;

   /* public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
