package com.powernode.spring6.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 14:24
 * @description:
 */
public class ZiTime {
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    public Date get() throws ParseException {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
       return format.parse(time);
    }
}
