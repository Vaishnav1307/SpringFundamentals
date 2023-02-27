package org.example;

import org.example.config.AppConfig;
import org.example.controllers.LoginController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        LoginController bean = context.getBean(LoginController.class);
        System.out.println(bean);
    }
}