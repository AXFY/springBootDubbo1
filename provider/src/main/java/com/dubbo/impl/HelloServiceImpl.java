package com.dubbo.impl;

import com.dubbo.dao.HelloDao;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author AXFY
 * @date 2020/5/29 17:43
 */
@Service(version = "1.0.0",interfaceClass = HelloDao.class)
public class HelloServiceImpl implements HelloDao {

    @Override
    public String getHello(){
        String str = "hello";
        return str;
    }
}
