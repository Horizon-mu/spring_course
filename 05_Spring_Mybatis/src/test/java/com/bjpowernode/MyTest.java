package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.entity.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("容器中的对象"+ name + "*****"  + applicationContext.getBean(name).getClass().getName());
        }
    }
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的对象
        StudentDao dao = (StudentDao) applicationContext.getBean("studentDao");
        Student student = new Student();
        student.setId(5);
        student.setName("粥粥");
        student.setEmail("shsi@1910.com");
        student.setAge(19);
        int num = dao.insertStudent(student);
        if(num == 1){
            System.out.println("添加成功");
        }
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的对象
        StudentService studentService =(StudentService) applicationContext.getBean("studentService");

        Student student = new Student();
        student.setId(6);
        student.setName("米米");
        student.setEmail("mimi@1910.com");
        student.setAge(21);
        int num = studentService.addStudent(student);
        //spring和mybatis整合在一起使用，事务是自动提交的，无需执行SqlSession.commit()方法
        if(num == 1){
            System.out.println("添加成功");
        }

        }

    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的对象
        StudentService studentService =(StudentService) applicationContext.getBean("studentService");

        List<Student> studentList = studentService.queryStudents();
        for (Student stu : studentList){
            System.out.println(stu);
        }

    }
}
