package com.example.thuexe.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.thuexe.R;
import com.example.thuexe.themxe_activity;

public class KhamPha extends Fragment {

    Activity context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


            context = getActivity();

        View root = inflater.inflate(R.layout.fragment_khampha, container, false);
        return root;


    }
    public void onStart(){
        super.onStart();
        Button btn = (Button) context.findViewById(R.id.addxe1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, themxe_activity.class);
                startActivity(intent);
            }
        });
    }
}
