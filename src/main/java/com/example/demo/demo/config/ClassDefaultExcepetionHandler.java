package com.example.demo.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 1.添加注解@ControllerAdvice
 * 2.在class中添加一个方法
 * 3.在方法中添加@ExceptionHandler拦截相应的异常信息
 * 4.如果返回的是view -----方法的返回值是modelAndView;
 * 4.如果返回的是String或Json数据 ---那么需要在方法上添加@ResponseBody注解
 * Created by wh1te on 2017/12/4.
 */
@ControllerAdvice
public class ClassDefaultExcepetionHandler {

//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public String defaultExceptionHandler(HttpServletRequest httpServletRequest,Exception e){
//        //返回的是String
//        return "对不起，服务器忙，请稍后再试";
//    }
}
