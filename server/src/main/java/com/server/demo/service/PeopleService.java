package com.server.demo.service;

import com.server.demo.entity.DO.PeopleDO;

import java.util.List;

public interface PeopleService {
    int deleteByPrimaryKey(Integer id);

    int insert(PeopleDO record);

    PeopleDO selectByPrimaryKey(Integer id);

    List<PeopleDO> selectAll();

    int updateByPrimaryKey(PeopleDO record);
}
