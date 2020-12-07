package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button sing_in = (Button)findViewById(R.id.sing_in);
        Button sing_up = (Button)findViewById(R.id.sing_up);
        Button skip = (Button)findViewById(R.id.skip);
        EditText username =(EditText)findViewById(R.id.username);
        EditText password =(EditText)findViewById(R.id.password);



        sing_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sing_up = new Intent(login.this, sing_up.class);
                startActivity(sing_up);
            }
        });



        public void sendPost(){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try { String UrlAdress="http://gym.areas.su/signup";
                    URL url = new URL(UrlAdress);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("post");
                    conn.setRequestProperty("Content-Type","application/json;charset=UTF-8");
                    conn.setRequestProperty("accept","application/json");
                    conn.setDoInput(true);
                    conn.setDoOutput(true);

                        JSONObject jsonParam = new JSONObject();

                        //sing_up
                        jsonParam.put("username",username.getText());
                        jsonParam.put("email",);
                        jsonParam.put("password",password.getText());
                        jsonParam.put("password",password.getText());


                        jsonParam.put("weight",)


                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            });
        }

    }
}