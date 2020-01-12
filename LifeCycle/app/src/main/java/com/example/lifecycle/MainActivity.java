package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ProcessLifecycleOwner;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Yaşam Döngüsü","OnCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Yaşam Döngüsü","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Yaşam Döngüsü","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Yaşam Döngüsü","OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Yaşam Döngüsü","OnRestart");
    }
}
