package com.example.demo.demo.repository;

import com.example.demo.demo.bean.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by wh1te on 2017/12/1.
 */
@Repository
public interface CatRepository extends CrudRepository <Cat,Integer>{


}
