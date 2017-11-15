package com.osoleksandr.dao;

import com.osoleksandr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}