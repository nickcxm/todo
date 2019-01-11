package com.nickc.todo.controller;

import com.nickc.todo.pojo.user.User;
import com.nickc.todo.service.UserService;
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

    @PostMapping(path = "/signUp")
    public User signUp(@RequestBody User user) {
        user = userService.signUp(user);
        return user;
    }

    @PostMapping(path = "/login")
    public boolean login(@RequestParam(name = "userName", required = true) String userName, @RequestParam(name = "passWord", required = true) String passWord) {
        return userService.login(userName,passWord);
    }
}
