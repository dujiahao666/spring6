package com.powernode.service;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/10 16:06
 * @description:
 */
public class DateFactoryBean implements FactoryBean<Date> {
    private String strDate;

    /*public void setStrDate(String strDate) {
        this.strDate = strDate;
    }*/

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(strDate);
        return parse;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
