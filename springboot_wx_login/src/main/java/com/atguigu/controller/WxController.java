package com.atguigu.controller;

import com.atguigu.util.ConstantPropertiesUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URLEncoder;

@Controller
@RequestMapping("/api/ucenter/wx")
public class WxController {
    @GetMapping("/login")
    public String generQRconnect() throws Exception {

        String baseUrl = "https://open.weixin.qq.com/connect/qrconnect" +
                "?appid=%s" +
                "&redirect_uri=%s" +
                "&response_type=code" +
                "&scope=snsapi_login" +
                "&state=%s" +
                "#wechat_redirect";
        String state = System.currentTimeMillis() + "";

        String redirectUri = ConstantPropertiesUtil.WX_OPEN_REDIRECT_URL;

        redirectUri = URLEncoder.encode(redirectUri, "utf-8");

        baseUrl = String.format(baseUrl, ConstantPropertiesUtil.WX_OPEN_APP_ID, redirectUri, state);

        return "redirect:"+ baseUrl;

    }
    //获取回调url
    @GetMapping("/callback")
    public String callback(String code,String state){
        System.out.println("code:"+code);
        System.out.println("state:"+state);
        return "";
    }

}
