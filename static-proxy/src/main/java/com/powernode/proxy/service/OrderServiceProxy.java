package com.powernode.proxy.service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 19:09
 * @description:
 */
public class OrderServiceProxy implements OrderService{
 //代理对象（代理对象和目标对象要具有相同的行为，就要实现同一个或同一些接口）
 //客户端在使用代理对象的时候就像在使用目标对象一样



 //将目标对象作为代理对象的一个属性。这种关系叫做关联关系。比继承关系的耦合度低。
 //代码对象中含有目标对象的引用。关联关系。has a



 //注意这里要写一个公共接口类型。因为公共接口耦合度低。
 OrderService orderService; //这就是目标对象，目标对象一定是实现了OrderService接口的


 //创建代理对象的时候，传一个目标对象给代理对象。
 public OrderServiceProxy(OrderService orderService) {
  this.orderService = orderService;
 }

 @Override
 public void generare() {  //代理方法
  //增强
  long star = System.currentTimeMillis();
  //调用目标对象和目标方法
  orderService.generare();
  long end = System.currentTimeMillis();
  System.out.println("耗时："+(end-star)+"毫秒");
 }

 @Override
 public void modify() {
  long star = System.currentTimeMillis();
  orderService.modify();
  long end = System.currentTimeMillis();
  System.out.println("耗时："+(end-star)+"毫秒");
 }

 @Override
 public void detail() {
  long star = System.currentTimeMillis();
  orderService.detail();
  long end = System.currentTimeMillis();
  System.out.println("耗时："+(end-star)+"毫秒");
 }
}
