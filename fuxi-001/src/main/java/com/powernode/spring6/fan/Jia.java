package com.powernode.spring6.fan;

import com.powernode.spring6.dao.Comp;
import com.powernode.spring6.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 9:49
 * @description:
 */
@Component("abcde")
public class Jia {
//        @Value("真好")
    private String name;
    //    @Value("21")
    private int age;
    @Autowired
    @Qualifier("student")
    private Student student;

//    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    public Jia() {
    }
//
//    @Autowired

//    要想@Value在构造方法中也可以成功，有两种解决方案，第一种就是不给无参数构造方法（就按构造注入了），这样就不会先创建对象了。（@Aytowired也是如此，一旦出现了无参数构造方法，有参数构造方法的一些东西就不生效了）
//    第二种就是即使给了无参数构造方法，但是在有参数构造方法上面加上@Autowired这样也可以解决问题（也告诉spring，我就是使用构造方法注入这种形式）
//    @Value可以直接在属性字段上使用，不给定set方法

/*
* 这里就是spring智能的点，如果有无参数构造方法，那就是首先按照set(默认优先)方法，进行依赖注入。先实例化，在进行赋值
* spring会智能判断，如果没有无参数构造方法，那么就按照构造方法注入。
*
*
*
*
* @Value
* @Autowired
* @qualify这三个哥们都不需要setter方法均可以直接给赋值
*
* 但是原生的spirng的xml的方法必须要setter方法
* */




//
//@Autowired
//    public Jia(@Value("佳佳") String name, @Value("21") int age, @Autowired Student student) {
//        this.name = name;
//        this.age = age;
//        this.student = student;
//    }

    @Override
    public String toString() {
        return "Jia{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student=" + student +
                '}';
    }
}
