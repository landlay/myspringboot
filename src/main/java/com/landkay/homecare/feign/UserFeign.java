package com.landkay.homecare.feign;

import com.landkay.homecare.model.User;
import com.landkay.homecare.model.response.UserResponse;
import org.springframework.stereotype.Service;
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
//@FeignClient(FeignConstant.SPRING_BOOT_NAME)
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
