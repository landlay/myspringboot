package com.landkay.springboot.service;

import com.landkay.springboot.model.User;

/**
 * Description //TODO
 * @param
 * @author landkay
 * @Date 17:10 2018/8/2
 * @return 
 **/
public interface UserService {

    /**
     * Description //TODO
     * @param userId
     * @author landkay
     * @Date 17:09 2018/8/2
     * @return 
     **/
    public User selectByPrimaryKey(Integer userId);
}
