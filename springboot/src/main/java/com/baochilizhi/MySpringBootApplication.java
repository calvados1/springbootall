package com.baochilizhi;

import com.baochilizhi.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(MySpringBootApplication.class, args);
        User user = (User) run.getBean("user");
        System.out.println(user);
    }
}
