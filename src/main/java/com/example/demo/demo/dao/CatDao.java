package com.example.demo.demo.dao;

import com.example.demo.demo.bean.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 使用repository注解，标注这是一个持久化操作对象。
 * Created by wh1te on 2017/12/4.
 */
@Repository
public class CatDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat selectByCatName (String catName){
        /**
         * 1.定义一个sql语句
         * 2.定义一个rowMapper
         * 3.执行查询方法
         */
        String sql = "select * from cat where cat_name=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
        return jdbcTemplate.queryForObject(sql,new Object[]{catName},rowMapper);
    }
}
