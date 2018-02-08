package com.dailyart.daggerapplicationtestversion2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 27DH on 2018/2/9.
 */

@Module
public class MainModule {

    @Provides
    @Named("original")
    public Cloth getCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @Named("red")
    public Cloth getRedCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @Named("blue")
    public Cloth getBlueCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

}
