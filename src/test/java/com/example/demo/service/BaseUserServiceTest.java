package com.example.demo.service;

import com.example.demo.entity.BaseUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bin on 2017/6/30 0030.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseUserServiceTest {

    @Autowired
    private BaseUserService baseUserService;

    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void insertBatch() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        BaseUser baseUser = baseUserService.selectByPrimaryKey("0213a474-bcbb-f2b6-9516-fc784ccd6cfc");
        System.out.println(baseUser);
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

    @Test
    public void selectAll() throws Exception {
        List<BaseUser> baseUserList = baseUserService.selectAll();
        System.out.println(baseUserList.size());
        System.out.println(baseUserList);
    }

}