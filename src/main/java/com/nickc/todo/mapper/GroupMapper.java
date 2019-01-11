package com.nickc.todo.mapper;

import com.nickc.todo.pojo.Group;
import java.util.List;

public interface GroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Group record);

    Group selectByPrimaryKey(Integer id);

    List<Group> selectAll(Integer user);

    int updateByPrimaryKey(Group record);
}