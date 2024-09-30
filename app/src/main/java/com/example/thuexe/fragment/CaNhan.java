package com.example.thuexe.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.thuexe.R;
import com.example.thuexe.activity_register;
import com.example.thuexe.canhan2;
import com.example.thuexe.login;
import com.example.thuexe.themxe_activity;

public class CaNhan extends Fragment {

    Activity main;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        main = getActivity();

        View root = inflater.inflate(R.layout.fragment_canhan, container, false);
        return root;
    }

        public void onStart(){
            super.onStart();
            ImageButton btn = (ImageButton) main.findViewById(R.id.logout);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(main, canhan2.class);
                    startActivity(intent);
                }
            });
    }
}


