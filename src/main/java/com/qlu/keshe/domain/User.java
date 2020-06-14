package com.qlu.keshe.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:11
 * Description：
 */
@TableName(value = "user")
public class User {
    @TableField("id")
    private int id;
    @TableField("uname")
    private String uname;
    @TableField("password")
    private String password;
    @TableField("warn")
    private int warn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getWarn() {
        return warn;
    }

    public void setWarn(int warn) {
        this.warn = warn;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", uname='").append(uname).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", warn=").append(warn);
        sb.append('}');
        return sb.toString();
    }
}
