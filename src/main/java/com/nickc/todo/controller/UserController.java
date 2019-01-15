package com.nickc.todo.controller;

import com.nickc.todo.mapper.UserMapper;
import com.nickc.todo.pojo.user.User;
import com.nickc.todo.service.UserService;
import com.nickc.todo.vo.Result;
import com.nickc.todo.vo.user.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 程旭敏 on 2019/1/10.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @PostMapping(path = "/signUp")
    public Result signUp(@RequestBody User user) {
        user = userService.signUp(user);
        if (null==user){
            return new Result(300,"用户名已经存在！",null);
        }
        return new Result(200,"注册成功！",user);
    }

    @PostMapping(path = "/login")
    public Result login(@RequestBody LoginParam loginParam) {
        if (userService.login(loginParam.getUserName(),loginParam.getPassWord())){
            return new Result(200,"登陆成功",userMapper.getUserByUserName(loginParam.getUserName()));
        }
        return new Result(500,"用户名或密码错误！",null);
    }
}
