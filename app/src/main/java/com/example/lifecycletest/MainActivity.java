package com.example.lifecycletest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends LogLifeCycleActivity {

    public MainActivity() {
        TAG = "MainActivity";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSecondActivity(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void showBoringDialoge(View v){
        SimpleDialogFragmet boringDialoge = new SimpleDialogFragmet();
        boringDialoge.show(getSupportFragmentManager(), "suchABoringDialoge");
    }
}
