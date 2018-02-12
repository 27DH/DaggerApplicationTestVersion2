package com.dailyart.daggerapplicationtestversion2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 27DH on 2018/2/13.
 */

@Module
public class SecondModule {

    @PerActivity
    @Provides
    public Cloth getBlueCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }
}
