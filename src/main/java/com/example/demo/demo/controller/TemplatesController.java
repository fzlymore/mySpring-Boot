package com.example.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 1.在Thymeleaf模板文件中，标签是需要闭合的，3.0之前是需要闭合的
 * 2.Thymeleaf 3.0+则不需要闭合
 * Created by wh1te on 2017/12/4.
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {

    /**
     * 映射地址是/templates/hello
     */
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name","jack");
        return "hello";
    }
}
