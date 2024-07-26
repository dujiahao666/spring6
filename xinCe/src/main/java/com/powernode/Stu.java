package com.powernode;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/9 23:00
 * @description:
 */
public class Stu {
 private String name;
 private int age;


 public Stu() {
  System.out.println("无参构造方法");
 }

 public Stu(String name, int age) {
  this.name = name;
  this.age = age;
  System.out.println("you参数构造方法");
 }

 /**
  * 获取
  * @return name
  */
 public String getName() {
  return name;
 }

 /**
  * 设置
  * @param name
  */
 public void setName(String name) {
  this.name = name;
 }

 /**
  * 获取
  * @return age
  */
 public int getAge() {
  return age;
 }

 /**
  * 设置
  * @param age
  */
 public void setAge(int age) {
  this.age = age;
 }

 public String toString() {
  return "Stu{name = " + name + ", age = " + age + "}";
 }
}
