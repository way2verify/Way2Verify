package com.example.testlib;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import sun.way2online.way2verify.Listeners.Way2LoginCallbacks;
import sun.way2online.way2verify.Way2VerifyLib;

/**
 * Created by sys1059 on 2/11/17.
 */

public class Appfile extends Application implements Way2LoginCallbacks {

    public Context cnt;
    public Appfile(Context cnt){
     this.cnt= cnt;
        Way2VerifyLib.initialize(cnt,"Token","PackageName");
    }


    @Override
    public void onLoginSuccess() {

        Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginFailure() {
        Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_LONG).show();
    }
}
