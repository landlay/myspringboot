package com.landkay.springboot.biz.impl;

import com.landkay.springboot.biz.UserBiz;
import com.landkay.springboot.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements UserBiz {


    @Override
    public UserInfo queryUserInfo(String userId) {

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("00000001");
        userInfo.setUserName("吕布");
        userInfo.setAge(28);
        return userInfo;
    }
}
