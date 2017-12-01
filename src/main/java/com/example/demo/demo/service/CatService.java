package com.example.demo.demo.service;

import com.example.demo.demo.bean.Cat;
import com.example.demo.demo.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by wh1te on 2017/12/1.
 */
@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }

    @Transactional
    public void delete(int id){
        catRepository.delete(id);
    }

    @Transactional
    public Iterable<Cat> getAll(){
     return catRepository.findAll();
    }
}