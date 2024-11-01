package com.hgj.springboot3x_study.service;


import com.hgj.springboot3x_study.pojo.User;
import com.hgj.springboot3x_study.pojo.dto.UserDto;
import com.hgj.springboot3x_study.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(UserDto userDto) {
        User newUser = new User();
        BeanUtils.copyProperties(userDto, newUser);
        return userRepository.save(newUser);
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElseThrow(()->{
            throw new IllegalArgumentException("用户不存在");
        });
    }

    @Override
    public User updateUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
