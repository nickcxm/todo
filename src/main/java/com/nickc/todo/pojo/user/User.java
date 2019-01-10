package com.nickc.todo.pojo.user;

import lombok.Data;
import lombok.ToString;

/**
 * Created by 程旭敏 on 2019/1/10.
 */
@Data
@ToString
public class User {
    private int id;

    private String userName;

    private String nickName;

    private String passWord;

    private String salt;
}
