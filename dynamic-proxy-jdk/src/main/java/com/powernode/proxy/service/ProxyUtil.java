package com.powernode.proxy.service;

import java.lang.reflect.Proxy;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/4 0:51
 * @description:
 */
public class ProxyUtil {
 public static Object newProxyInstance(Object targer){
  return Proxy.newProxyInstance(targer.getClass().getClassLoader(), targer.getClass().getInterfaces(),new TimerInvokectionHandler(targer));
 }
}
