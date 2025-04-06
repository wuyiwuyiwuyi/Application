package com.business.controller;

import com.business.entity.Do.UserInfoDo;
import com.business.entity.Dto.UserInfoDto;
import com.business.share.IUserInfoShare;
import org.springframework.stereotype.Controller;

import java.util.Objects;


@Controller
public class UserInfoController implements IUserInfoShare {

    @Override
    public UserInfoDto getUserInfo(UserInfoDo userInfoDo) {
        if (Objects.isNull(userInfoDo)){
            return new UserInfoDto();
        } else {
            UserInfoDto userInfoDto = new UserInfoDto();
            userInfoDto.setAge("18");
            return userInfoDto;
        }
    }
}
