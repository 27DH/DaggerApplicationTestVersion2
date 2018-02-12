package com.dailyart.daggerapplicationtestversion2;

import com.dailyart.daggerapplicationtestversion2.thirdtest.BaseComponent;

import dagger.Component;

/**
 * Created by 27DH on 2018/2/13.
 */

@PerActivity
@Component(modules = SecondModule.class, dependencies = BaseComponent.class)
public interface SecondComponent {
    void inject(SecondActivity secondActivity);
}
