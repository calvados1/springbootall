package com.baochilizhi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private DataSourceProperties dataSourceProperties;

    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println(dataSourceProperties);
        return "Hello spring boot";
    }

}
