package com.example.thuexe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.thuexe.fragment.CaNhan;

public class canhan2 extends AppCompatActivity {
    EditText login;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canhan2);

        login = findViewById(R.id.dangnhap);
        Register = findViewById(R.id.Dangky);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(canhan2.this,login.class);
                startActivity(intent);
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(canhan2.this,activity_register.class);
                startActivity(intent);
            }
        });
    }
}