package com.example.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends LogLifeCycleActivity {

    public SecondActivity() {
        TAG = "SecondActivity";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void startThirdActivity(View v){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
