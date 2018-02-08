package com.dailyart.daggerapplicationtestversion2;

/**
 * Created by 27DH on 2018/2/9.
 */

public class Cloth {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料.";
    }
}
