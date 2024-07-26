package com.powernode.service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/7 8:23
 * @description:
 */
public class Wife {
    private int shu;
    private String zhang;
    private String wai;

    public Wife() {
    }

    public Wife(int shu, String zhang, String wai) {
        this.shu = shu;
        this.zhang = zhang;
        this.wai = wai;
    }

    /**
     * 获取
     * @return shu
     */
    public int getShu() {
        return shu;
    }

    /**
     * 设置
     * @param shu
     */
    public void setShu(int shu) {
        this.shu = shu;
    }

    /**
     * 获取
     * @return zhang
     */
    public String getZhang() {
        return zhang;
    }

    /**
     * 设置
     * @param zhang
     */
    public void setZhang(String zhang) {
        this.zhang = zhang;
    }

    /**
     * 获取
     * @return wai
     */
    public String getWai() {
        return wai;
    }

    /**
     * 设置
     * @param wai
     */
    public void setWai(String wai) {
        this.wai = wai;
    }

    public String toString() {
        return "Wife{shu = " + shu + ", zhang = " + zhang + ", wai = " + wai + "}";
    }

    public void show(){
        System.out.println("全是杜嘉豪的女大36d");
    }
}
