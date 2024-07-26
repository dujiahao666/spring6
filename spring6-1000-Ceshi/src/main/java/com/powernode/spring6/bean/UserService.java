package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 15:06
 * @description:
 */
public class UserService {
 private User user;

 public void setWoqu(User user) {
  this.user = user;
 }

 public void save(){
  user.insert();
 }
}
