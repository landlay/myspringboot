package com.landkay.springboot.biz;

import com.landkay.springboot.model.UserInfo;

public interface UserBiz {

    /**
     * query userInfo by userId
     * @return
     * @param userId
     */
    UserInfo queryUserInfo(String userId);
}
