package com.nickc.todo.controller;

import com.nickc.todo.mapper.MissionMapper;
import com.nickc.todo.pojo.Group;
import com.nickc.todo.pojo.Mission;
import com.nickc.todo.pojo.user.User;
import com.nickc.todo.vo.MissionChangeParam;
import com.nickc.todo.vo.Result;
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

    @PostMapping("/add")
    public Result insert(@RequestBody Mission mission){
        int a =missionMapper.insert(mission);
        System.out.println(a);
        System.out.println(mission.toString());
        return new Result(200,"添加成功",mission);
    }

    @PostMapping("/change")
    public boolean change(@RequestBody Mission mission){
        missionMapper.updateByPrimaryKey(mission);
        return true;
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        missionMapper.deleteByPrimaryKey(id);
        return true;
    }

    @GetMapping("/getImportant")
    public Result getImp(@RequestParam Integer uid){
        return new Result(200,"获取成功",missionMapper.getImportant(uid));
    }


}
