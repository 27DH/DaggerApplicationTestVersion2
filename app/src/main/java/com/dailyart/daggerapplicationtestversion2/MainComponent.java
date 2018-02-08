package com.dailyart.daggerapplicationtestversion2;

import dagger.Component;

/**
 * Created by 27DH on 2018/2/9.
 */

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
