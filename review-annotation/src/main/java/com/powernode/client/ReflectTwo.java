package com.powernode.client;

import com.powernode.annotation.MyComponent;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/26 14:56
 * @description:
 */
public class ReflectTwo {
    public static void main(String[] args) {
        Map<String, Object> map=new HashMap<>();
        String packageName="com.powernode.bean";
        String packagePath = packageName.replaceAll("\\.", "/");

        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);

        String realPath = url.getPath();
        File file=new File(realPath);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            try {
//                String Filename = f.getName();
//            String[] split = Filename.split("\\.");
//                String realName = Filename.split("//.")[0];
                String zong=packageName+"."+f.getName().split("\\.")[0];
//                System.out.println(zong);
                Class<?> aClass = Class.forName(zong);
                if(aClass.isAnnotationPresent(MyComponent.class)){
                    MyComponent annotation = aClass.getAnnotation(MyComponent.class);
                    System.out.println(annotation.value());
                    Object obj = aClass.getDeclaredConstructor().newInstance();
                    map.put(annotation.value(),obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println(map);
    }
}
