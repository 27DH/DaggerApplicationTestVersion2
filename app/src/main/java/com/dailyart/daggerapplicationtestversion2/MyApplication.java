package com.dailyart.daggerapplicationtestversion2;

import android.app.Application;

import com.dailyart.daggerapplicationtestversion2.thirdtest.BaseComponent;
import com.dailyart.daggerapplicationtestversion2.thirdtest.BaseModule;
import com.dailyart.daggerapplicationtestversion2.thirdtest.DaggerBaseComponent;

/**
 * Created by 27DH on 2018/2/13.
 */

public class MyApplication extends Application {
    private BaseComponent baseComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent(){
        return baseComponent;
    }

}
