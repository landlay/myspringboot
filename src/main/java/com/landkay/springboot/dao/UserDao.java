package com.landkay.springboot.dao;

import com.landkay.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description //TODO
 * @param
 * @author landkay
 * @Date 17:05 2018/8/2
 * @return 
 **/
@Mapper
public interface UserDao {

    /**
     * Description 根据userId查询userInfo
     * @param userId
     * @author landkay
     * @Date 17:07 2018/8/2
     * @return 
     **/
    public User selectByPrimaryKey(@Param("userId") Integer userId);
}
