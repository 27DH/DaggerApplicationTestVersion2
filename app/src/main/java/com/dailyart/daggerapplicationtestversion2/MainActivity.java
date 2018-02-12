package com.dailyart.daggerapplicationtestversion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dailyart.daggerapplicationtestversion2.secondtest.Shoe;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Inject
    @Named("original")
    Cloth cloth;

    @Inject
    Shoe shoe;

    @Inject
    Cloth clothRed;

    @Inject
    Cloth clothBlue;

    @Inject
    ClothHandler clothHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.myTextView);
       // MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        //build.inject(this);
        //textView.setText(shoe.toString() + clothRed.toString() + clothBlue.toString());
        //textView.setText("红布料加工后变成了" + clothHandler.handle(clothRed) + "\n" + clothHandler);

        MainComponent build = DaggerMainComponent.builder().baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .mainModule(new MainModule()).build();
        build.inject(this);
        textView.setText("红布料加工后变成了" + clothHandler.handle(clothRed) + "\nclothHandler地址:" + clothHandler);

    }

    public void onClick(View v){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
