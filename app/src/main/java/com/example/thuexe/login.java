package com.example.thuexe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class login extends AppCompatActivity {

    TextInputEditText edUsernameC,edPasswordC;

    Button login1;
    ImageButton backk;
    @SuppressLint(value = "WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edUsernameC = findViewById(R.id.edUserename);
        edPasswordC = findViewById(R.id.edPassword);

        login1 =  findViewById(R.id.login);
        backk  = findViewById(R.id.backk3);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsernameC.getText().toString().trim();
                String password = edPasswordC.getText().toString().trim();
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
                {
                Toast.makeText(login.this, "Yêu cầu đăng nhập!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i = new Intent(login.this, Menu.class);
                    i.putExtra("username", username);
                    i.putExtra("password", password);
                    startActivity(i);
            }}
        });
        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this,canhan2.class);
                startActivity(i);
            }
        });
    }

    public void btShowCustomAlertDialog_click(View view) {
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View loginview = inflater.inflate(R.layout.quenmk, null);

        builder.setView(loginview);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    }
