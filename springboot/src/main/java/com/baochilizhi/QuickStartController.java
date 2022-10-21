package com.baochilizhi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class QuickStartController {
/*
    @Value("${server.port}")
    private String port;

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;
*/


    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
/*        System.out.println("port = " + port);
        System.out.println("username = " + username);
        System.out.println("password = " + password);*/
        return "spring boot running...";
    }
}
