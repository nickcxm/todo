package com.nickc.todo.mapper;

import com.nickc.todo.pojo.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 程旭敏 on 2019/1/10.
 */
@Mapper
public interface UserMapper {
    User getUserByUserName(String userName);
    int insertUser(User user);
}
