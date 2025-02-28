package com.example.thuexe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    //variables
    Animation topAnim, bottomAnim;
    ImageView image,backgr,icon;
    TextView logo , slogan;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);


        //
        logo = findViewById(R.id.textView2);
        slogan = findViewById(R.id.textView3);
        backgr = findViewById(R.id.backgr);
        icon = findViewById(R.id.icon);


        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);
        backgr.setAnimation(topAnim);
        icon.setAnimation(bottomAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivities(new Intent[]{intent});
                finish();
            }
        },SPLASH_SCREEN);
        }
    }
