package com.powernode.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/3 20:34
 * @description:
 */
public class TimerInvokectionHandler implements InvocationHandler {
 Object target;
 public TimerInvokectionHandler(Object target) {
  this.target=target;
 }

 public TimerInvokectionHandler() {
 }

 /*
   invoke方法方法的三个参数：
   invoke方法是负责调用的，所以JDK调用这个方法的时候会自动给我们传过来三个参数。
   我们可以在invoke方法的大括号中直接嗲用
   第一个参数：object proxy 代理对象的引用，这个参数使用较少
   第二个参数：目标对象上的目标方法
   第三个参数：目标方法上的实参
    */
 @Override
 public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
  //这个接口的目的就是为了让你有地方写增强代码
//  System.out.println("增强1");
  long l = System.currentTimeMillis();
  Object invoke = method.invoke(target, args);
  //调用目标对象上的目标方法
//  System.out.println("增强2");
  long l1 = System.currentTimeMillis();
//  invoke=invoke+"没哭";
  System.out.println("耗时"+(l1-l)+"毫秒");
  return invoke;
 }
}

