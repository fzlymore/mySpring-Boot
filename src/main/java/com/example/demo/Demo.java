package com.example.demo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by wh1te on 2017/11/30.
 */
public class Demo {

    private int id ;
    private String name;

    @JSONField(serialize = false)
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
