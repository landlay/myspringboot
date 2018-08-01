package com.landkay.springboot.controller;

import com.landkay.springboot.Constant.ResponseCodeConstant;
import com.landkay.springboot.biz.UserBiz;
import com.landkay.springboot.model.User;
import com.landkay.springboot.model.UserInfo;
import com.landkay.springboot.model.response.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserBiz userBiz;

    @GetMapping(value = "/query/userInfo")
    public UserResponse queryUserInfo(User user) {

        UserResponse userResponse = new UserResponse();
        UserInfo result = new UserInfo();

        //check requestParams
        if (StringUtils.isBlank(user.getUserId())){
            userResponse.setCode(ResponseCodeConstant.PARAMS_ISNULL.getCode());
            userResponse.setMsg(ResponseCodeConstant.PARAMS_ISNULL.getMsg());
            return userResponse;
        }
        try {
            log.info("请求参数为: requestParams = " + user.getUserId());
            result = userBiz.queryUserInfo(user.getUserId());
            userResponse.setCode(ResponseCodeConstant.SUCCESS.getCode());
            userResponse.setMsg(ResponseCodeConstant.SUCCESS.getMsg());
            userResponse.setResult(result);
        } catch (Exception e) {
            log.error(e.getMessage());
            userResponse.setCode(ResponseCodeConstant.ERROR.getCode());
            userResponse.setMsg(ResponseCodeConstant.ERROR.getMsg());
            return userResponse;
        }
        return userResponse;
    }
}
