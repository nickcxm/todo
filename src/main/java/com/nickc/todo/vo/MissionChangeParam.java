package com.nickc.todo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by 程旭敏 on 2019/1/14.
 */
@Data
public class MissionChangeParam implements Serializable {
    private int id;

    private int status;
}
