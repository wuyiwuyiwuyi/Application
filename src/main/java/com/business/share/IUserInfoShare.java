package com.business.share;

import com.business.entity.Do.UserInfoDo;
import com.business.entity.Dto.UserInfoDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
public interface IUserInfoShare {

    @RequestMapping("/info")
    @ResponseBody
    public UserInfoDto getUserInfo(@RequestBody UserInfoDo userInfoDo);

}
