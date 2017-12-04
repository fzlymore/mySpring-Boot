package com.example.demo.demo.mapper;

import com.example.demo.demo.bean.DaiMao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
public interface DemoMapper {
      //#{name}:参数占位符
      @Select("select * from customer where name=#{name}")
       List<DaiMao> likeName(String name);

      @Select("select * from customer where id=#{id}")
       DaiMao getById(long id);

      @Select("select name from customer where id=#{id}")
       String getNameById(long id);
}
