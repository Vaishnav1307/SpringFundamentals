package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "controllers")
public class AppConfig {

//    @Bean
//    LoginController loginController1() {
//        return new LoginController();  // this will be added to spring context
//    }
//
//    @Bean
//    LoginController loginController2() {
//        return new LoginController();  // this will be added to spring context
//    }

}
