package com.powernode.test;

import com.powernode.annotation.MyComponent;
import org.junit.Test;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/26 14:41
 * @description:
 */
public class TestUser {
    @Test
    public void testComponent()throws Exception{
        Class<?> aClass = Class.forName("com.powernode.bean.User");
        boolean annotation = aClass.isAnnotationPresent(MyComponent.class);
        if(annotation){
            MyComponent annotation1 = aClass.getAnnotation(MyComponent.class);
            System.out.println(annotation1.toString());
        }
    }
}
