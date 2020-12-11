package com.fh.bookstore.service;

import com.fh.bookstore.entity.User;

import java.util.List;

/**
 * @author HueFu
 * @version 0.0.1
 * @date 2020-12-11 17:16
 */
public interface UserService {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(List<User> list);

}
