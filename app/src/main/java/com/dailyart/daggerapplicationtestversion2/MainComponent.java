package com.dailyart.daggerapplicationtestversion2;

import com.dailyart.daggerapplicationtestversion2.thirdtest.BaseComponent;

import dagger.Component;

/**
 * Created by 27DH on 2018/2/9.
 */

@PerActivity
@Component(modules = MainModule.class ,dependencies = BaseComponent.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
