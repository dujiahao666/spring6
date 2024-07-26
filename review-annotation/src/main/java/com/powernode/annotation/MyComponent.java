package com.powernode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/26 14:24
 * @description:
 */

//标注注解的注解，叫做元注解
//使用某个注解的时候，如果注解的属性名是value的话，value可以省略
//使用某个注解的时候，如果注解的属性值是数组，并且数组中只有一个元素，大括号可以省略
@Target(ElementType.TYPE)
//Retention 也是一个元注解，用来标注@Compoment注解最终保留在class文件中，并且可以被反射机制读取。
@Retention(RetentionPolicy.RUNTIME)
public @interface MyComponent {

    //定义注解的属性
    //String是属性类型
    //value是属性名
    String value();


    //其他的属性
    //属性类型String
    //属性名name
    //String name();

    //数组属性
    //属性类型：String[]
    //属性名：names
    //String[] names;

//    int[] ages();
}


