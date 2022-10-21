package com.atguigu;

import com.atguigu.service.SendMailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SendMailServiceTest {

    @Autowired
    private SendMailService sendMailService;

    @Test
    public void demo01() throws Exception{
        sendMailService.sendMail();
    }

}
