package com.example.thuexe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.thuexe.fragment.CaNhan;
import com.google.android.material.textfield.TextInputLayout;

public class activity_register extends AppCompatActivity {


    ImageButton back;
    Button dangky;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        back = findViewById(R.id.quayve);
        dangky = findViewById(R.id.dangky1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(activity_register.this, canhan2.class);
                startActivity(i);
            }
        });
        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity_register.this, "Đăng ký thành công!", Toast.LENGTH_LONG).show();

                Intent i = new Intent(activity_register.this, canhan2.class);
                startActivity(i);
            }
        });

    }

}

