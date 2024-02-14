package com.closetCS.dao;

import com.closetCS.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.closetCS.POJO.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailId(@Param("email") String email);

    List<UserWrapper> getAllUser();
}
