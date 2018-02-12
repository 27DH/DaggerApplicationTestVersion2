package com.dailyart.daggerapplicationtestversion2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dailyart.daggerapplicationtestversion2.secondtest.Shoe;

import javax.inject.Inject;
import javax.inject.Named;

public class SecondActivity extends AppCompatActivity {


    private TextView textView;

    @Inject
    Cloth clothBlue;

    @Inject
    ClothHandler clothHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.mySecondTextView);
        //MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        SecondComponent secondComponent = DaggerSecondComponent.builder().baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .secondModule(new SecondModule()).build();
        secondComponent.inject(this);
        textView.setText("蓝布料加工后变成了" + clothHandler.handle(clothBlue) + "\nclothHandler地址:" + clothHandler);



    }
}
