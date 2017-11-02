package com.example.way2verifytesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import sun.way2online.way2verify.Way2VerifyLib;

public class SuccessScreenActivity extends AppCompatActivity {
    Button mLogout_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_screen);
         mLogout_b = (Button) findViewById(R.id.logout_b);
        mLogout_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Way2VerifyLib.logout(SuccessScreenActivity.this);
                startActivity(new Intent(SuccessScreenActivity.this,MainActivity.class));
            }
        });

    }

}
