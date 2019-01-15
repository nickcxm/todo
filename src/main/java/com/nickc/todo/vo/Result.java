package com.nickc.todo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by 程旭敏 on 2019/1/11.
 */
@Data
@AllArgsConstructor
@ToString
public class Result implements Serializable {
    private int code;
    private String msg;
    private Object data;
}
