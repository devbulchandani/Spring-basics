package com.example.autowired.annotation;

import com.example.autowired.annotation.AppConfig;
import com.example.autowired.annotation.Employee;
import com.example.autowired.annotation.Manager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(employee.toString());
        System.out.println(manager.toString());
    }
}
