package com.server.demo.service;

import com.server.demo.dao.PeopleDOMapper;
import com.server.demo.entity.DO.PeopleDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Resource
    PeopleDOMapper peopleDOMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return peopleDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PeopleDO record) {
        return peopleDOMapper.insert(record);
    }

    @Override
    public PeopleDO selectByPrimaryKey(Integer id) {
        return peopleDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PeopleDO> selectAll() {
        return peopleDOMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(PeopleDO record) {
        return peopleDOMapper.updateByPrimaryKey(record);
    }
}
