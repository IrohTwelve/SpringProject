package com.osoleksandr.service;

public interface SecurityService {

    String findLoggedInUsersByUsername();

    void autoLogin(String username, String password);
}
