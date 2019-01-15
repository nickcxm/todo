package com.nickc.todo.controller;

import com.nickc.todo.mapper.GroupMapper;
import com.nickc.todo.pojo.Group;
import com.nickc.todo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 程旭敏 on 2019/1/11.
 */
@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @Autowired
    private GroupMapper groupMapper;

    @PostMapping("/insert")
    public Group insert(@RequestBody Group group){
        groupMapper.insert(group);
        return group;
    }

    @GetMapping("/get")
    public List<Group> getAll(@RequestParam Integer user){
        return groupService.getAllGroup(user);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        groupService.deleteGroupById(id);
        return true;
    }

}
