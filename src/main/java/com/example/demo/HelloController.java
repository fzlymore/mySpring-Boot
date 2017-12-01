package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wh1te on 2017/11/30.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,this is my first spring-boot!";
    }


    /**
     * springBoot默认使用的json解析框架是json
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("张三");
        return demo;
    }

}
