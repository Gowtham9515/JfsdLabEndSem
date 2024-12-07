package com.klef.jfsd.exam.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.klef.jfsd.exam.model.Employee;
import com.klef.jfsd.exam.model.Course;

public class ClientDemo {
    public static void main(String[] args) {
        // Using Java Config
        ApplicationContext context = new AnnotationConfigApplicationContext(com.klef.jfsd.exam.config.ApplicationConfig.class);
        
        // Using XML Config
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = (Employee) context.getBean("employee");
        Course course = (Course) context.getBean("course");

        System.out.println("Employee Details: " + employee);
        System.out.println("Course Details: " + course);
    }
}
