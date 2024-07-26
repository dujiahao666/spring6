package com.powernode.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 14:15
 * @description:
 */
public class DateFactory implements FactoryBean<Date> {
    private String date;

    public DateFactory(String date) {
        this.date = date;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.parse(this.date);

    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
