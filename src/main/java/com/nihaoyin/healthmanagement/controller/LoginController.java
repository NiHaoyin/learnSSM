package com.nihaoyin.healthmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.nihaoyin.healthmanagement.bean.User;
import com.nihaoyin.healthmanagement.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        User us = userDao.getUserByMessage(user.getUsername(),user.getPassword());
        System.out.println(us);
        HashMap<String, Object> res = new HashMap<>();
        res.put("user", us);
        if (us == null){
            res.put("flag", false);
        }else{
            res.put("flag", true);
        }
        return JSON.toJSONString(res);
    }
}
