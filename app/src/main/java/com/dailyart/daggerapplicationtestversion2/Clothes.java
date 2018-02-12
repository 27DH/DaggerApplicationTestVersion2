package com.dailyart.daggerapplicationtestversion2;

/**
 * Created by 27DH on 2018/2/13.
 */

public class Clothes {
    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }
}



