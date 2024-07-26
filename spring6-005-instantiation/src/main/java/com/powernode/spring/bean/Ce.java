package com.powernode.spring.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 9:53
 * @description:
 */
public class Ce {
    private String name;

    public void setName(String name) {
        System.out.println("第二步:给对象的属性赋值"+"["+name+"}"+"无参构造方法执行了【第二步】");
        this.name = name;

    }

    public Ce() {
        System.out.println(name+"无参构造方法执行了【第一步】");
    }

    @Override
    public String toString() {
        return "Ce{" +
                "name='" + name + '\'' +
                '}';
    }

    public void duo(){
        System.out.println("我是多余的");
    }

    public void inintme(){
        System.out.println("第三步：初始化");
    }

    public void destoryme(){
        System.out.println("第五步，销毁");
    }
}
