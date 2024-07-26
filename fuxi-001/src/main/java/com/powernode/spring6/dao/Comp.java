package com.powernode.spring6.dao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 8:57
 * @description:
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Comp {
    String abc() default "真好";

    int age () default 21;

    String value();
}
