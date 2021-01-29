package com.fzshuai.dao;

import com.fzshuai.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 软件二班傅同学
 * @date 2021-01-23 19:07
 */
public interface TypeRepository extends JpaRepository<Type, Long> {

    Type findByName(String name);
}
