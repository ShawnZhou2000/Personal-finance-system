package com.qlu.keshe.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author：TuoJun
 * @date：2020/06/12 13:18
 * Description：
 */
@TableName("pay")
public class Pay {
    @TableField("id")
    private int id;
    @TableField("user_id")
    private int userId;
    @TableField("money")
    private double money;
    @TableField("update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;
    @TableField("comment")
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pay{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", money=").append(money);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", comment='").append(comment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
