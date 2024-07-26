package com.powernode.spring.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 9:28
 * @description:
 */
public class DateFactoryBean implements FactoryBean<Date> {
    //DateFactoryBean这个工厂Bean协助我们Spring创建这个普通的Bean:Date
    private String strDate;

    public DateFactoryBean() {
    }

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
