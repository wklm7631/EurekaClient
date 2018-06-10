package com.example.demo.com.bc.client.jdbc.name;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class NameService  {
    @Autowired
    private NameDao nameDao;

    public List<Name> queryNames(){
        return nameDao.findAll();
    }
}
