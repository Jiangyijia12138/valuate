package com.hundsun.valuate.dao;

import com.alibaba.fastjson.JSONObject;
import com.hundsun.valuate.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.websocket.server.PathParam;


public interface LoginDao {
    int login(String username, String password);
}
