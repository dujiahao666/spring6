package com.powernode.spring6.bean2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 9:05
 * @description:
 */
@Component
public class A {
    public A() {
        System.out.println("A的无参数构造方法执行");
    }
}


@Controller
class E {
    public E() {
        System.out.println("E的无参数构造方法执行");
    }
}