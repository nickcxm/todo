package com.nickc.todo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Mission implements Serializable {
    private Integer id;

    private String text;

    private Integer groupid;

    private Integer user;

    private Boolean important;

    private String status;

    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", text=").append(text);
        sb.append(", groupid=").append(groupid);
        sb.append(", user=").append(user);
        sb.append(", important=").append(important);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}