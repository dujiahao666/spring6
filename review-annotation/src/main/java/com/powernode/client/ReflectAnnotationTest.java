package com.powernode.client;

import com.powernode.annotation.MyComponent;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/26 14:46
 * @description:
 */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {
        //通过反射机制怎么读取注解
        Class<?> aClass = Class.forName("com.powernode.bean.User");
        if(aClass.isAnnotationPresent(MyComponent.class)){
            MyComponent annotation = aClass.getAnnotation(MyComponent.class);
            System.out.println(annotation.value());
        }
    }
}
