package com.powernode.spring6.bean;

import java.util.Arrays;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 15:32
 * @description:
 */
public class QianDaYe {
    private String[] aiHaos;

    //多个女性朋友
    private Woman[] woman;

    public void setWoman(Woman[] woman) {
        this.woman = woman;
    }

    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }

    @Override
    public String toString() {
        return "QianDaYe{" +
                "aiHaos=" + Arrays.toString(aiHaos) +
                ", woman=" + Arrays.toString(woman) +
                '}';
    }
}
