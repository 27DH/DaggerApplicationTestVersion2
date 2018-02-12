package com.dailyart.daggerapplicationtestversion2;

/**
 * Created by 27DH on 2018/2/13.
 */
public class ClothHandler {
    public Clothes handle(Cloth cloth){
        return new Clothes(cloth);
    }
}
