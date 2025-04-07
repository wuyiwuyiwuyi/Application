package com.business.applicationserviceprovider.entity.Dto;


public class UserInfoDto {

    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserInfoDto(String age) {
        this.age = age;
    }

    public UserInfoDto() {
    }
}
