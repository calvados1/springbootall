package com.atguigu.service.impl;

import com.atguigu.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    /**rognuzfrhzmkgifc
     * 收件人 ：xxx@qq.com
     * 邮件内容：
     * 附件
     * 设置主题
     * 发送人
     */
    // 设置发送人
    private String from = "1606143305@qq.com";
    // 设置收件人
    private String to = "1934133965@qq.com";
    // 设置邮件的标题
    private String subject = "测试发送邮件";
    // 设置邮件的内容
    private String content = "<img src='https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fpic%2F2%2Fcf%2F8b2a1141395.jpg&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1668913861&t=e58ea406d0289849fdca067efb99ca6d'/><br/>如果想获取更多美女图片，请扫描附件里面的二维码";


    /**
     * 所有的异常不要去抓，都要往外抛，所有的异常必须抛给前端控制器
     * @throws Exception
     */
    @Override
    public void sendMail() throws Exception{
        // 创建简单邮件对象
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        // 设置发件箱
        simpleMailMessage.setFrom(from);
        // 设置收件箱
        simpleMailMessage.setTo(to);
        // 设置邮件的标题
        simpleMailMessage.setSubject(subject);
        // 设置内容
        simpleMailMessage.setText(content);
        // 发送邮件
        javaMailSender.send(simpleMailMessage);
       /* // 表示多媒体类型 text/html application/json Mime类型
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //  第一个参数：表示多媒体的类型
        // 第二个参数：表示上传文件
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        // 设置发件箱
        mimeMessageHelper.setFrom(from + "(春梅)");
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(content);


        // 需要添加附件
        File file = new File("D:\\workspace\\sz_java_220704\\公告.docx");
        // 添加附件
        mimeMessageHelper.addAttachment(file.getName(),file);
        javaMailSender.send(mimeMessage);*/
    }
}
