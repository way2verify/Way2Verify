package com.example.way2verifytesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import sun.way2online.way2verify.Listeners.Way2LoginCallbacks;
import sun.way2online.way2verify.Way2VerifyLib;

public class MainActivity extends AppCompatActivity implements Way2LoginCallbacks {

    Button loginbutton;
    static String token =   "YOUR_TOKEN";
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton = (Button) findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Way2VerifyLib.initialize(MainActivity.this,token,"Your_packagename");
            }
        });


    }



    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, "onLoginSuccess", Toast.LENGTH_SHORT).show();

        startActivity(new Intent(this,SuccessScreenActivity.class));
    }

    @Override
    public void onLoginFailure() {
        Toast.makeText(this, "onLoginFailure", Toast.LENGTH_SHORT).show();

    }


}
