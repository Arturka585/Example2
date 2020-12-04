package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getPreferences(MODE_PRIVATE);
                if(pref.getBoolean("isFirstRun",true)){
                    Intent I = new Intent(MainActivity.this,step_1.class);
                    startActivity(I);
                }
                else{
                    Intent I = new Intent(MainActivity.this,login.class);
                    startActivity(I);
                }
                pref.edit().putBoolean("isFirstRun",true).apply();
            }
        }, 3*100);



        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}