package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class step_2 extends AppCompatActivity {

    int pressed=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_2);

        ImageButton male = (ImageButton)findViewById(R.id.male);
        Button next = (Button)findViewById(R.id.next_button);
        ImageButton fermale = (ImageButton) findViewById(R.id.fermale);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                male.setImageResource(R.drawable.pressed_male);
                pressed=1;
                fermale.setImageResource(R.drawable.fermale);
            }
        });

        male.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                male.setImageResource(R.drawable.male);
                pressed=2;
                fermale.setImageResource(R.drawable.pressed_fermale);
                return false;
            }
        });

        fermale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fermale.setImageResource(R.drawable.pressed_fermale);
                pressed=2;
                male.setImageResource(R.drawable.male);
            }
        });

        fermale.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                fermale.setImageResource(R.drawable.fermale);
                pressed=1;
                male.setImageResource(R.drawable.pressed_male);
                return false;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pressed==1){
                    Intent I = new Intent(step_2.this,step_3.class);
                    startActivity(I);
                }
                else{
                    if (pressed==2){
                        Intent I=new Intent(step_2.this,Step_3_w.class);
                        startActivity(I);
                    }
                }
            }
        });

        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}