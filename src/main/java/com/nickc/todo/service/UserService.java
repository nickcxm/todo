package com.nickc.todo.service;

import com.nickc.todo.mapper.UserMapper;
import com.nickc.todo.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 程旭敏 on 2019/1/10.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 注册
     * @param user
     * @return
     */
    public boolean signUp(User user){
        try {

        }
    }
}
