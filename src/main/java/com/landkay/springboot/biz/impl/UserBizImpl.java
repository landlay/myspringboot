package com.landkay.springboot.biz.impl;

import com.landkay.springboot.biz.UserBiz;
import com.landkay.springboot.model.User;
import com.landkay.springboot.model.UserInfo;
import com.landkay.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description //TODO
 * @param
 * @author landkay
 * @Date 17:12 2018/8/2
 * @return 
 **/
@Service
public class UserBizImpl implements UserBiz {

    @Autowired
    UserService userService;

    @Override
    public User queryUserInfo(Integer userId) {

        User user = userService.selectByPrimaryKey(userId);

        User userInfo = new User();
        userInfo.setUserName("吕布无敌");
        userInfo.setAge("28");
        return user;
    }

    @Override
    public Integer insertOne(User user) {

        Integer integer = userService.insertOne(user);

        return integer;
    }
}
