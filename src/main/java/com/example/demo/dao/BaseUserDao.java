package com.example.demo.dao;

import com.example.demo.entity.BaseUser;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by bin on 2017/6/30 0030.
 */
public interface BaseUserDao {

    /**
     *根据用户id删除数据
     * @param ruiZhiUserId 用户id
     * @return
     */
    int deleteByPrimaryKey(String ruiZhiUserId);

    /**
     *插入数据
     * @param record 用户实体类
     */
    void insert(BaseUser record);

    /**
     *插入数据（选择性）
     * @param record 用户实体类
     */
    void insertSelective(BaseUser record);

    /**
     *批量插入数据
     * @param records 用户实体类集合
     */
    void insertBatch(List<BaseUser> records);

    /**
     *根据用户id查询数据
     * @param ruiZhiUserId 用户id
     * @return
     */
    BaseUser selectByPrimaryKey(String ruiZhiUserId);

    /**
     *根据用户id修改数据（选择性）
     * @param record 用户实体类
     * @return
     */
    int updateByPrimaryKeySelective(BaseUser record);

    /**
     * 根据用户id修改数据
     * @param record 用户实体类
     * @return
     */
    int updateByPrimaryKey(BaseUser record);

    List<BaseUser> selectAll();
}
