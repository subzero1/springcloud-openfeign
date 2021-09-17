package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/t1")
    public Map t1(){
        Date date=new Date();
        Map ss=new HashMap();
        ss.put("v1",new Date());
        ss.put("v2","嚯嚯嚯我是服务1");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ss.put("耗时",new Date().getTime()-date.getTime());
        return  ss;
    }
}
