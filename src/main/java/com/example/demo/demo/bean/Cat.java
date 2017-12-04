package com.example.demo.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建一个实体类
 * 如何持久化？
 * 1.使用@Entity进行实体类的持久化操作，当JAP检测到我们实体类的时候当中@Entity注解的时候，
 * 会在数据库生成对应的表结构信息
 *
 * 如何指定主键以及主键的生成策略？
 * 1.使用@Id指定主键
 * Created by wh1te on 2017/12/1.
 */
@Entity
public class Cat {

    /**
     * 使用@Id作为主键
     * 使用代码@GeneratedValue(strategy = GenerationType.AUTO)指定主键的生成策略
     * mysql默认的是自增长
     */
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String catName;

    private int catAge;

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
