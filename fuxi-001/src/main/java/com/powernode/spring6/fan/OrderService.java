package com.powernode.spring6.fan;

import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/9 8:44
 * @description:
 */
@Component
public class OrderService {

    public void method1(){
        System.out.println("方法一执行了......");
       /* if(1==1){
            throw  new RuntimeException("出现了未知问题....");
        }*/
    }

    public void method2(){
        System.out.println("方法二执行了.......");
    }

    public void method3(){
        System.out.println("方法三执行了......");
    }
}
