package com.hgj.springboot3x_study.controller;

import com.hgj.springboot3x_study.pojo.ResponseMessage;
import com.hgj.springboot3x_study.pojo.User;
import com.hgj.springboot3x_study.pojo.dto.UserDto;
import com.hgj.springboot3x_study.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{userId}")
    public ResponseMessage<User> getUser(@PathVariable("userId") Integer userId){
        User findOne = userService.getUser(userId);
        return ResponseMessage.success(findOne);
    }

    @PostMapping
    public ResponseMessage<User> addUser(@Validated @RequestBody UserDto userDto){
        log.info("addUser:{}",userDto.toString());
        User user = userService.saveUser(userDto);
        return ResponseMessage.success(user);
    }

    @PutMapping
    public ResponseMessage<User> updateUser(@Validated @RequestBody UserDto userDto) {
        log.info("updateUser:{}", userDto.toString());
        User updatedUser = userService.updateUser(userDto);
        return ResponseMessage.success(updatedUser);
    }

    @DeleteMapping("/{userId}")
    public ResponseMessage<String> deleteUser(@PathVariable("userId") Integer userId){
        log.info("deleteUser:{}", userId);
        userService.deleteUser(userId);
        return ResponseMessage.success("success");
    }
}
