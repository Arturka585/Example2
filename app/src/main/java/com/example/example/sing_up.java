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

public class sing_up extends AppCompatActivity {
    EditText password;
    EditText mail;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        mail = (EditText) findViewById(R.id.mail);
        password = (EditText) findViewById(R.id.password);
        EditText password2 = (EditText) findViewById(R.id.password2);
        Button sing_up = (Button) findViewById(R.id.sing_up);
        Button back = (Button) findViewById(R.id.back_button);
        EditText username = (EditText) findViewById(R.id.username);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(sing_up.this, login.class);
                startActivity(I);


            }
        });

        sing_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mail.getText().toString().trim();

                String emailPattern = "[a-xA-Z0-9._-]+@[a-z]\\.+[a-z]+";
                if (email.matches(emailPattern)) {
                    if (password.length() == 0 || mail.length() == 0 || username.length() == 0) {
                        Toast.makeText(sing_up.this, "Не заполнено одно из полей", Toast.LENGTH_SHORT).show();
                    } else {
                        if (password.getText().toString().equals(password2.getText().toString())) {
                            sendPost();
                            Intent I = new Intent(sing_up.this, login.class);
                            startActivity(I);
                        } else {
                            Toast.makeText(sing_up.this, "пароли не совпадают", Toast.LENGTH_SHORT).show();
                            password.setText("");
                            password2.setText("");
                        }
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Email введен не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
            public void sendPost() {
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
                        jsonParam.put("mail",mail.getText());
                        jsonParam.put("password",password.getText());
                        jsonParam.put("password",password.getText());


                        jsonParam.put("weight",100);
                        jsonParam.put("height",100);

                        //json data
                        Log.i("json",jsonParam.toString());
                        DataOutputStream os = new DataOutputStream(conn.getOutputStream());
                        os.writeBytes(jsonParam.toString());

                        os.flush();
                        os.close();

                        Log.i("status",String.valueOf(conn.getOutputStream()));
                        Log.i("MSG",conn.getResponseMessage());


                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }

                }
         });



        thread.start();

        Window w =getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}