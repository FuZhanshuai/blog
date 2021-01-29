package com.fzshuai.service;

import com.fzshuai.po.User;

/**
 * @author 软件二班傅同学
 * @date 2021-01-22 21:14
 */
public interface UserService {

    User checkUser(String username, String password);
}
