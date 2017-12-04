package com.example.demo.demo.controller;

import com.example.demo.demo.bean.DaiMao;
import com.example.demo.demo.service.DaiMaoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
@RestController
@RequestMapping("/mybatis")
public class DaiMaoController {
    @Autowired
    private DaiMaoService daiMaoService;

    @RequestMapping("/likeName")
    public List<DaiMao> likeName(String name){
        PageHelper.startPage(1,2);
       return daiMaoService.likename(name);
    }
}
