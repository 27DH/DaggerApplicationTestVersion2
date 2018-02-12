package com.dailyart.daggerapplicationtestversion2.thirdtest;

import com.dailyart.daggerapplicationtestversion2.ClothHandler;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 27DH on 2018/2/13.
 */

@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();
}
