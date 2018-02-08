package com.dailyart.daggerapplicationtestversion2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 27DH on 2018/2/9.
 */

@Module
public class MainModule {

    @Provides
    public Cloth getCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

}
