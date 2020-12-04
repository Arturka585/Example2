package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Step_3_w extends AppCompatActivity {

    Animation anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_3_w);

        Button hands = (Button)findViewById(R.id.hands);
        Button spine = (Button)findViewById(R.id.spine);
        Button torso = (Button)findViewById(R.id.torso);
        Button legs = (Button)findViewById(R.id.legs);
        ImageView woman = (ImageView)findViewById(R.id.womman);

        anim = AnimationUtils.loadAnimation(this,R.anim.woman);
        woman.startAnimation(anim);

        hands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I= new Intent(Step_3_w.this,step_4.class);
                startActivity(I);
            }
        });

        spine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I= new Intent(Step_3_w.this,step_4.class);
                startActivity(I);
            }
        });

        torso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I= new Intent(Step_3_w.this,step_4.class);
                startActivity(I);
            }
        });

        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I= new Intent(Step_3_w.this,step_4.class);
                startActivity(I);
            }
        });

        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}