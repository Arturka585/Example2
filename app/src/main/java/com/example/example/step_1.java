package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class step_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_1);

        Button weight = (Button)findViewById(R.id.weight);
        Button yoga = (Button)findViewById(R.id.yoga);
        Button muscle = (Button)findViewById(R.id.muscle);
//переход по кнопке
        //начало
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent Weight = new Intent(step_1.this, step_2.class);
                    startActivity(Weight);
            }
        });
        //конец

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Weight = new Intent(step_1.this, step_2.class);
                startActivity(Weight);
            }
        });

        muscle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Weight = new Intent(step_1.this, step_2.class);
                startActivity(Weight);
            }
        });

        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

}