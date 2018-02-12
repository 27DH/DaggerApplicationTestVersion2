package com.dailyart.daggerapplicationtestversion2.thirdtest;

import com.dailyart.daggerapplicationtestversion2.ClothHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 27DH on 2018/2/13.
 */

@Module
public class BaseModule {

    @Singleton
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
