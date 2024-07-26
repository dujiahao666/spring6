package com.powernode.spring6.dao;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 9:10
 * @description:
 */
public class TestComp {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Class<?> aClass = Class.forName("com.powernode.spring6.dao.Test");
//        boolean annotationPresent = aClass.isAnnotationPresent(Comp.class);
//        System.out.println(annotationPresent);
//        Comp annotation = aClass.getAnnotation(Comp.class);
//        System.out.println(annotation);
//        System.out.println(annotation.age());
//        System.out.println(annotation.abc());
        URL resource = ClassLoader.getSystemClassLoader().getResource("com/powernode/spring6/dao");
        System.out.println(resource);
        System.out.println(resource.toString());
        System.out.println(resource.getPath());
        File file = new File(resource.getPath());
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        Arrays.stream(files).forEach(arg -> {
            String classname = arg.getName().split("\\.")[0];
            System.out.println(classname);

        });


    }
}
