package com.cj.multidatasourcedemo.service;

import com.cj.multidatasourcedemo.dao.other.UserRepository;
import com.cj.multidatasourcedemo.pojo.other.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: 用户
 * @Author: chenj
 * @Date: 2021/3/1
 **/
@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public List<User> findAll()
    {
        return userRepository.findAll();
    }

    public List<String> getUserList()
    {
        return userRepository.findByXX();
    }
}
