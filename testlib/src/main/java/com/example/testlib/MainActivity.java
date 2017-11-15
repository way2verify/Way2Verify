package com.example.testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sun.way2online.way2verify.Listeners.Way2LoginCallbacks;
import sun.way2online.way2verify.Way2VerifyLib;

public class MainActivity extends AppCompatActivity implements Way2LoginCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFailure() {

    }
}
