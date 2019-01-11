package com.nickc.todo.controller;

import com.nickc.todo.mapper.MissionMapper;
import com.nickc.todo.pojo.Group;
import com.nickc.todo.pojo.Mission;
import com.nickc.todo.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by 程旭敏 on 2019/1/11.
 */
@RestController
@RequestMapping("/mission")
public class MissionController {
    @Autowired
    private MissionMapper missionMapper;

    @GetMapping("/get")
    public List<Mission> getAll(@RequestParam(name = "groupId",required = true) Integer groupId, @RequestParam(name = "user",required = true) Integer user){
        Map<String,Object> map=new HashMap<>();
        map.put("groupId",groupId);
        map.put("user",user);
        return missionMapper.selectAll(map);
    }

//    public Mission insert(@RequestBody Mission mission){
//
//    }
}
