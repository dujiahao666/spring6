package com.powernode.service;

import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/10 16:05
 * @description:
 */
public class Nao {
    private Date date;

    public Nao() {
    }

    public Nao(Date date) {
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
        return "Nao{date = " + date + "}";
    }
}
