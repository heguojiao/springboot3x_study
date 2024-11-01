package com.hgj.springboot3x_study.service;

import com.hgj.springboot3x_study.pojo.User;
import com.hgj.springboot3x_study.pojo.dto.UserDto;

public interface IUserService {

    User saveUser(UserDto userDto);

    User getUser(Integer userId);

    User updateUser(UserDto userDto);

    void deleteUser(Integer userId);
}
