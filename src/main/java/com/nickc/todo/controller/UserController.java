package com.nickc.todo.controller;

import com.nickc.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 程旭敏 on 2019/1/10.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
}
