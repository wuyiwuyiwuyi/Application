package com.business.applicationserviceprovider.share;

import com.business.applicationserviceprovider.entity.Do.UserInfoDo;
import com.business.applicationserviceprovider.entity.Dto.UserInfoDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
public interface IUserInfoShare {

    @RequestMapping("/get/info")
    @ResponseBody
    UserInfoDto getUserInfo(@RequestBody UserInfoDo userInfoDo);

}
