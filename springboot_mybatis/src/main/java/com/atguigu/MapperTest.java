package com.atguigu;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void test02() {
        String root = stringEncryptor.encrypt("root");
        String pwd = stringEncryptor.encrypt("1234");
        String url = stringEncryptor.encrypt("jdbc:mysql://localhost:3306/springboot?autoReconnect=true&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
        System.out.println("password:" + root);
        System.out.println("pwd:" + pwd);
        System.out.println("url:" + url);
    }

}
