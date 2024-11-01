package com.hgj.springboot3x_study.repository;

import com.hgj.springboot3x_study.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
