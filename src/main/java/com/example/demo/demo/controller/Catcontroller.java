package com.example.demo.demo.controller;

import com.example.demo.demo.bean.Cat;
import com.example.demo.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wh1te on 2017/12/4.
 */
@RestController
@RequestMapping("/cat")
public class Catcontroller {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatName("jack");
        cat.setCatAge(3);
        catService.save(cat);
        return "save";
   }

    @RequestMapping("/delete")
    public String delete(){
        catService.delete(1);
        return "delete";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

    @RequestMapping("/findByCatName")
    public Cat findByCatName(String catName){
        return catService.findByCatName(catName);
    }

    @RequestMapping("/findMyCatName")
    public Cat findMyCatName(String catName){
        return catService.findMyCatName(catName);
    }

    @RequestMapping("/selectByCatName")
    public Cat selectByCatName(String catName){
        return catService.selectByName(catName);
    }
}
