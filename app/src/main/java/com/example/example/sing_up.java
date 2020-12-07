package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class sing_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        Button sing_up = (Button)findViewById(R.id.sing_up);
        Button back =(Button)findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(sing_up.this,login.class);
                startActivity(I);


            }
        });

        sing_up.setOnClickListener(new View.OnClickListener() {
            String email = ;

            String emailPattern="[a-xA-Z0-9._-]+\\.+[a-z]+";

        });

        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}