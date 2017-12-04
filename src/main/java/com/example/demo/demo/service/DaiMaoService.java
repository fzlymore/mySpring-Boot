package com.example.demo.demo.service;

import com.example.demo.demo.bean.DaiMao;
import com.example.demo.demo.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
@Service
public class DaiMaoService {
    @Resource
    public DemoMapper demoMapper;

    public List<DaiMao> likename(String name){
        return demoMapper.likeName(name);
    }
}
