package com.example.demo.demo.repository;

import com.example.demo.demo.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * Created by wh1te on 2017/12/4.
 */
public interface Cat2Repository extends Repository<Cat,Integer> {

    /**
     * 查询方法以get|find|read开头，
     * 涉及查询条件的时候，条件的属性用关键字连接，条件属性的首字母要大写
     */
     Cat findByCatName(String catName);

    /**
     * 如何编写JPQL语句
     * hibernate  -- HQL语句
     * JPQL和HQL语句是类似的
     */
    @Query("from Cat where catName=:cn")
     Cat findMyCatName(@Param("cn") String catName);
}
