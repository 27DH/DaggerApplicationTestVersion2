package com.dailyart.daggerapplicationtestversion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    @Red("red")
    Cloth clothRed;

    @Inject
    @Blue("blue")
    Cloth clothBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.myTextView);
        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        build.inject(this);
        textView.setText(shoe.toString() + clothRed.toString() + clothBlue.toString());


    }
}
