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

public class step_3 extends AppCompatActivity {

    Animation anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_3);


            Button hands = (Button)findViewById(R.id.hand);
            Button spine = (Button)findViewById(R.id.Spine);
            Button torso = (Button)findViewById(R.id.tors);
            Button legs = (Button)findViewById(R.id.Legs);
            ImageView man = (ImageView)findViewById(R.id.man);

            anim = AnimationUtils.loadAnimation(this,R.anim.man);
            man.startAnimation(anim);

            hands.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent I= new Intent(step_3.this,step_4.class);
                    startActivity(I);
                }
            });

            spine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent I= new Intent(step_3.this,step_4.class);
                    startActivity(I);
                }
            });

            torso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent I= new Intent(step_3.this,step_4.class);
                    startActivity(I);
                }
            });

            legs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent I= new Intent(step_3.this,step_4.class);
                    startActivity(I);
                }
            });

            Window w =getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
}