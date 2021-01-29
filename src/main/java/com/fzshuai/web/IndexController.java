package com.fzshuai.web;

import com.fzshuai.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 软件二班傅同学
 * @date 2021-01-18 10:59
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("博客不存在！");
//        }
        System.out.println("-----------index-----------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
