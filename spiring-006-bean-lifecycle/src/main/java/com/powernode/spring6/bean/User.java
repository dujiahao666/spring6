package com.powernode.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 14:14
 * @description:
 *
 * Bean的声明周期按照粗略的五步的话：
 * 第一步：实例化Bean(调用无参数构造方法)
 * 第二步：给Bean的属性赋值(调用set方法)
 * 第三步：初始化Bean（会调用Bean的init方法。注意：这个init方法需要自己写，自己配）
 * 第四步：使用Bean
 * 第五步：销毁Bean(会调用Bean的destory方法。注意：这个destory方法需要自己写，自己配)
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {
    private String name;

    public void setName(String name) {
        System.out.println("第二步：Bean的属性赋值");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User() {
        System.out.println("第一步：无参构造方法执行");
    }

    //这个方法需要自己写，自己配，方法名随意
    public void initMethod(){
        System.out.println("第四步：初始化方法执行了");
    }

    //这个方法需要自己写，自己配，方法名随意
    public void destoryMethod(){
        System.out.println("第七步：销毁方法执行了");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean这个类的加载器："+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产这个Bean的工厂对象是："+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("这个Bean的名字是"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean’s  InitializingBean方法执行 ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean‘s  DisposableBean方法执行");
    }
}
