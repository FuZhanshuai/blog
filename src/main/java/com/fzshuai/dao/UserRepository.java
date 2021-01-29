package com.fzshuai.dao;

import com.fzshuai.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 软件二班傅同学
 * @date 2021-01-22 21:20
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
