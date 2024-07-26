package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 14:41
 * @description:
 */
public class Fu {
   private String name;
    private Zi zi;

   public void setName(String name) {
      this.name = name;
   }

   public void setZi(Zi zi) {
      this.zi = zi;
   }

   @Override
   public String toString() {
      return "Fu{" +
              "name='" + name + '\'' +
              ", zi=" + zi +
              '}';
   }
}
