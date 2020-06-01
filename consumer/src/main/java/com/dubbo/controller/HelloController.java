package com.dubbo.controller;

import com.dubbo.dao.HelloDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @author AXFY
 * @date 2020/5/29 17:57
 */
@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    private HelloDao helloDao;

    @RequestMapping("hello")
    public String getHello(){
        return helloDao.getHello();
    }
}
