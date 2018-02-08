package com.dailyart.daggerapplicationtestversion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Inject
    Cloth cloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.myTextView);
        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        build.inject(this);
        textView.setText(cloth.toString());


    }
}
