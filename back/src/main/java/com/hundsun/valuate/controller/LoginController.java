package com.hundsun.valuate.controller;

import com.alibaba.fastjson.JSONObject;
import com.hundsun.valuate.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginDao loginDao;

    @PostMapping("/login")
    public JSONObject login(@RequestBody JSONObject user) {
        String username = user.getString("username");
        String password = user.getString("password");
        JSONObject success = new JSONObject();
        if (loginDao.login(username, password) == 1) {
            success.put("code", "200");
            success.put("msg", "登陆成功");
        } else {
            success.put("code", "500");
            success.put("msg", "登录失败");
        }
        return success;
    }

    @GetMapping("/login")
    public JSONObject login() {
        String username = "admin";
        String password = "123456";
        JSONObject success = new JSONObject();
        if (loginDao.login(username, password) == 1) {
            success.put("code", "200");
            success.put("msg", "登陆成功");
        } else {
            success.put("code", "500");
            success.put("msg", "登录失败");
        }
        return success;
    }

}
