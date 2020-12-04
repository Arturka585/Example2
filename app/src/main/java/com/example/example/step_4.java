package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class step_4 extends AppCompatActivity {
  int pressed = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_4);

        Button next=(Button)findViewById(R.id.next_button);
        ImageView newbie = (ImageView)findViewById(R.id.newbie);
        ImageView keep_on = (ImageView)findViewById(R.id.keep_on);
        ImageView advanced = (ImageView)findViewById(R.id.advanced);

        newbie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newbie.setImageResource(R.drawable.pressed_newbie);
                pressed=1;
                keep_on.setImageResource(R.drawable.keep_on);
                advanced.setImageResource(R.drawable.advanced);
            }
        });

        newbie.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newbie.setImageResource(R.drawable.newbie);
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
    }
}