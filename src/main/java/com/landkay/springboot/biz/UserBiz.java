package com.landkay.springboot.biz;

import com.landkay.springboot.model.User;

/**
 * Description //TODO
 * @param
 * @author landkay
 * @Date 17:12 2018/8/2
 * @return 
 **/
public interface UserBiz {

    /**
     * query userInfo by userId
     * @return
     * @param userId
     */
    User queryUserInfo(Integer userId);
}
