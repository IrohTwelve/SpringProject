package com.osoleksandr.service;

import com.osoleksandr.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);


}
