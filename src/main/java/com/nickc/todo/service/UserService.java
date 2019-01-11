package com.nickc.todo.service;

import com.nickc.todo.mapper.UserMapper;
import com.nickc.todo.pojo.user.User;
import com.nickc.todo.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;

/**
 * Created by 程旭敏 on 2019/1/10.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 注册
     *
     * @param user
     * @return
     */
    public User signUp(User user) {
        try {
            User existUser = userMapper.getUserByUserName(user.getUserName());
            if (existUser != null) {
                return null;
            }
            user.setSalt(PasswordUtil.genSalt());
            user.setPassWord(PasswordUtil.genPass(user.getPassWord(), user.getSalt()));
            int id = userMapper.insertUser(user);
            user.setId(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }

    /**
     * 登陆
     *
     * @param userName
     * @param pass
     * @return
     */
    public boolean login(String userName, String pass) {
        User user = userMapper.getUserByUserName(userName);
        if (user == null) {
            return false;
        }
        return PasswordUtil.verify(pass, user.getSalt(), user.getPassWord());
    }

}
