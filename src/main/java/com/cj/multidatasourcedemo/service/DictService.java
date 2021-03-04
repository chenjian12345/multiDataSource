package com.cj.multidatasourcedemo.service;

import com.cj.multidatasourcedemo.dao.basic.DictRepository;
import com.cj.multidatasourcedemo.pojo.basic.Dict;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: 字典
 * @Author: chenj
 * @Date: 2021/3/1
 **/
@Service
public class DictService {

    @Resource
    private DictRepository dictRepository;

    public List<Dict> findAll()
    {
        return dictRepository.findAll();
    }
}
