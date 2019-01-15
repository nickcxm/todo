package com.nickc.todo.service;

import com.nickc.todo.mapper.GroupMapper;
import com.nickc.todo.mapper.MissionMapper;
import com.nickc.todo.pojo.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 程旭敏 on 2019/1/11.
 */
@Service
public class GroupService {
    @Autowired
    GroupMapper groupMapper;

    @Autowired
    MissionMapper missionMapper;

    public List<Group> getAllGroup(Integer userId){
        return groupMapper.selectAll(userId);
    }

    public void deleteGroupById(Integer id){
        groupMapper.deleteByPrimaryKey(id);
        missionMapper.deleteByGroup(id);
    }
}
