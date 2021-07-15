package com.test.jenkins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv_show = findViewById(R.id.tv_show);
        mTv_show.setText(String.format("BASEURL=%s,\r\n commonId=%s",BuildConfig.BASEURL,BuildConfig.commonId));

    }
}