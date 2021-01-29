package com.fzshuai.dao;

import com.fzshuai.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 软件二班傅同学
 * @date 2021-01-26 20:23
 */
public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {


}
