package com.powernode;

import javax.sql.DataSource;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/9 23:31
 * @description:
 */
public class ShowTime {
    private Date date;

    public ShowTime() {
    }

    public ShowTime(Date date) {
        this.date = date;
    }

    /**
     * 获取
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "时间是："+"ShowTime{+date = " + date + "}";
    }
}
