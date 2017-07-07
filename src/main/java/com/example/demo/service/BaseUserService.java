package com.example.demo.service;

import com.example.demo.dao.BaseUserDao;
import com.example.demo.entity.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bin on 2017/6/30 0030.
 */
@Service
public class BaseUserService {

    private final BaseUserDao baseUserDao;

    @Autowired(required = false)
    public BaseUserService(BaseUserDao baseUserDao) {
        this.baseUserDao = baseUserDao;
    }

    /**
     *根据用户id删除数据
     * @param ruiZhiUserId 用户id
     * @return
     */
    public int deleteByPrimaryKey(String ruiZhiUserId) {
        return baseUserDao.deleteByPrimaryKey(ruiZhiUserId);
    }

    /**
     *插入数据
     * @param record 用户实体类
     */
    public void insert(BaseUser record) {
        baseUserDao.insert(record);
    }

    /**
     *插入数据（选择性）
     * @param record 用户实体类
     */
    public void insertSelective(BaseUser record) {
        baseUserDao.insertSelective(record);
    }

    /**
     *批量插入数据
     * @param records 用户实体类集合
     */
    public void insertBatch(List<BaseUser> records) {
        baseUserDao.insertBatch(records);
    }

    /**
     *根据用户id查询数据
     * @param ruiZhiUserId 用户id
     * @return
     */
    public BaseUser selectByPrimaryKey(String ruiZhiUserId) {
        return baseUserDao.selectByPrimaryKey(ruiZhiUserId);
    }

    /**
     *根据用户id修改数据（选择性）
     * @param record 用户实体类
     * @return
     */
    public int updateByPrimaryKeySelective(BaseUser record) {
        return baseUserDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据用户id修改数据
     * @param record 用户实体类
     * @return
     */
    public int updateByPrimaryKey(BaseUser record) {
        return baseUserDao.updateByPrimaryKey(record);
    }

    public List<BaseUser> selectAll() {
        return baseUserDao.selectAll();
    }
}
