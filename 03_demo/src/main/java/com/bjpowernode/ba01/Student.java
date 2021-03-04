package com.bjpowernode.ba01;

import org.springframework.stereotype.Component;

/**
 * @Component 创建对象的，相当于<bean></bean>的功能
 *  属性：value 就是对象的名称，也就是<bean></bean>的id值
 *              value值唯一，创建的对象在容器中是惟一的
 *              value 可以省略
 *  位置：在类的上面
 */

/**
 * 在spring中和@Component功能一样，创建对象的注解还有：
 *      1：@Repository(用在持久层类上面) 放在dao的实现类上面，
 *          表示创建dao的对象，dao对象是可以访问数据库的
 *      2.@Service(用在业务层上面)，放在Service的实现类上面，
 *          创建service的对象，service对象是做业务处理的，可以有事务功能
 *      3.@Controller(用在控制器的上面)，放在控制器类的上面，
 *          创建控制器对象，能够接受用户提交的参数，显示请求的处理结果
 * 以上三个注解的语法和@Component是一样的，都能够创建对象，但这三个注解还有其他功能
 *      @Repository @Service @Controller用来给项目分层。
 *
 */
@Component(value = "myStudent")
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
