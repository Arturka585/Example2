package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class step_4 extends AppCompatActivity {
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
                keep_on.setImageResource(R.drawable.keep_on);
                advanced.setImageResource(R.drawable.advanced);
            }
        });

        newbie.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newbie.setImageResource(R.drawable.newbie);
                keep_on.setImageResource(R.drawable.pressed_keep_on);
                advanced.setImageResource(R.drawable.advanced);
                return  false;
            }
        });

        newbie.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newbie.setImageResource(R.drawable.newbie);
                keep_on.setImageResource(R.drawable.keep_on);
                advanced.setImageResource(R.drawable.pressed_advanced);
                return  false;
            }
        });

        keep_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newbie.setImageResource(R.drawable.newbie);
                keep_on.setImageResource(R.drawable.pressed_keep_on);
                advanced.setImageResource(R.drawable.advanced);
            }
        });

        keep_on.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newbie.setImageResource(R.drawable.pressed_newbie);
                keep_on.setImageResource(R.drawable.keep_on);
                advanced.setImageResource(R.drawable.advanced);
                return  false;
            }
        });

        keep_on.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newbie.setImageResource(R.drawable.newbie);
                keep_on.setImageResource(R.drawable.keep_on);
                advanced.setImageResource(R.drawable.pressed_advanced);
                return  false;
            }
        });

        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newbie.setImageResource(R.drawable.newbie);
                keep_on.setImageResource(R.drawable.keep_on);
                advanced.setImageResource(R.drawable.pressed_advanced);
            }
        });

        advanced.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newbie.setImageResource(R.drawable.pressed_newbie);
                keep_on.setImageResource(R.drawable.keep_on);
                advanced.setImageResource(R.drawable.advanced);
                return  false;
            }
        });

        advanced.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newbie.setImageResource(R.drawable.newbie);
                keep_on.setImageResource(R.drawable.pressed_keep_on);
                advanced.setImageResource(R.drawable.advanced);
                return  false;
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(step_4.this, step_5.class);
                startActivity(I);

            }
        });


        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}