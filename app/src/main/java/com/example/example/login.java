package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class login extends AppCompatActivity {

    Button sing_in;
    Button sing_up;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button sing_in = (Button) findViewById(R.id.sing_in);
        Button sing_up = (Button) findViewById(R.id.sing_up);
        Button skip = (Button) findViewById(R.id.skip);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);


        sing_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.length() == 0 || username.length() == 0) {
                    Toast.makeText(login.this, "Не заполнено одно из полей", Toast.LENGTH_SHORT).show();
                } else {
                    sendpost();
                    Intent a = new Intent(login.this, back.class);
                    startActivity(a);
                }
            }
        });
        sing_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sing_up = new Intent(login.this, sing_up.class);
                startActivity(sing_up);
            }
        });
    }

            public void sendpost() {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            String urlAdress="http://gym.areas.su/signin";
                            URL url = new URL(urlAdress);
                            HttpURLConnection conn = null;
                            conn = (HttpURLConnection) url.openConnection();
                            conn.setRequestMethod("post");
                            conn.setRequestProperty("Content-Type","application/json;charset=UTF-8");
                            conn.setRequestProperty("accept","application/json");
                            conn.setDoInput(true);
                            conn.setDoOutput(true);

                            JSONObject jsonParam = new JSONObject();

                            jsonParam.put("username",username.getText());
                            jsonParam.put("password",password.getText());

                            Log.i("json",jsonParam.toString());
                            DataOutputStream os = new DataOutputStream(conn.getOutputStream());
                            os.writeBytes(jsonParam.toString());

                            os.flush();
                            os.close();

                        } catch (IOException | JSONException e) {
                            e.printStackTrace();
                        }

                    }
                });
            thread.start();


                Window w=getWindow();
                w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



   }

}