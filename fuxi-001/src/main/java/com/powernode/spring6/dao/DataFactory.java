package com.powernode.spring6.dao;

import org.springframework.beans.factory.FactoryBean;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/7 20:51
 * @description:
 */
public class DataFactory implements FactoryBean<Date> {
    private String time;

//    public void setTime(String time) {
//        this.time = time;
//    }

    public DataFactory(String time) {
        this.time = time;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat data=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = data.parse(time);
        return parse;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
