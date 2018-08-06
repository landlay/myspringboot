package com.landkay.springboot.feign;

import com.landkay.springboot.constant.FeignConstant;
import com.landkay.springboot.model.User;
import com.landkay.springboot.model.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 90818
 * @Title: UserFeign
 * @ProjectName springboot
 * @Description: TODO
 * @date 2018/8/317:08
 */
@Service
@FeignClient(FeignConstant.SPRING_BOOT_NAME)
public interface UserFeign {

    /**
     * Description //TODO
     * @param user
     * @author landkay
     * @Date 17:15 2018/8/3
     * @return UserResponse
     **/
    @RequestMapping(value = "/user/query/userInfo", method = RequestMethod.GET)
    public UserResponse queryUserInfo(User user);
}
