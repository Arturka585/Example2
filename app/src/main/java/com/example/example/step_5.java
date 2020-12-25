package com.example.example;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class step_5 extends AppCompatActivity {

    SharedPreferences sPrefs;

    int a = 0;
    String text;
    String text2;

    FileOutputStream fos = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_5);

        Button next = (Button) findViewById(R.id.next_button);
        EditText height = (EditText) findViewById(R.id.height);
        EditText weight = (EditText) findViewById(R.id.weight);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent I = new Intent(step_5.this,login.class);
                startActivity(I);

                text = weight.getText().toString();
                try {
                    FileOutputStream fileOutput = openFileOutput("weigh_height.txt", MODE_PRIVATE);
                    fileOutput.write(text.getBytes());
                    fileOutput.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            text2 = height.getText().toString();
                try {
                FileOutputStream fileOutput = openFileOutput("weigh_height.txt", MODE_PRIVATE);
                fileOutput.write(text2.getBytes());
                fileOutput.close();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        });
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
