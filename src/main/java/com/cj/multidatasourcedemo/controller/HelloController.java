package com.cj.multidatasourcedemo.controller;

import com.cj.multidatasourcedemo.pojo.other.User;
import com.cj.multidatasourcedemo.pojo.basic.Dict;
import com.cj.multidatasourcedemo.service.DictService;
import com.cj.multidatasourcedemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Resource
    private UserService userService;
    @Resource
    private DictService dictService;

    @RequestMapping("/index")
    public List<User> sayHello(@RequestParam("customerCode") String customerCode)
    {
        return userService.findAll();
    }

    @RequestMapping("/index2")
    public List<Dict> sayHello3(@RequestParam("customerCode") String customerCode)
    {
        return dictService.findAll();
    }

    @RequestMapping("/users")
    public List<String> sayHello2(@RequestParam("customerCode") String customerCode)
    {
        return userService.getUserList();
    }
}