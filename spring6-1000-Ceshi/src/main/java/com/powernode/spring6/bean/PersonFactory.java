package com.powernode.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 14:12
 * @description:
 */
public class PersonFactory implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
