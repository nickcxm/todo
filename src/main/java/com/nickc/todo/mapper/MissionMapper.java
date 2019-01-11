package com.nickc.todo.mapper;

import com.nickc.todo.pojo.Mission;
import java.util.*;

public interface MissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mission record);

    Mission selectByPrimaryKey(Integer id);

    List<Mission> selectAll(Map<String,Object> map);

    int updateByPrimaryKey(Mission record);
}