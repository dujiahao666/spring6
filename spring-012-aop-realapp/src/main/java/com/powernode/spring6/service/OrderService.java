package com.powernode.spring6.service;

import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 19:21
 * @description:
 */
@Component
public class OrderService {

 //生成订单的方法
 public void generate(){

  System.out.println("正在生成订单...");
  /*if (1==1){
   throw  new RuntimeException();
  }*/
//  String s=null;
//  s.toString();
 }

 //取消订单的业务方法
 public void cancel(){
  System.out.println("订单已取消...");
 }
}
