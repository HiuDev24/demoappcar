package com.example.thuexe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.thuexe.Utils.User;
import com.example.thuexe.Utils.UserAdapter;
import com.example.thuexe.Utils.UserDataQuery;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class dangkyxe extends AppCompatActivity implements UserAdapter.UserCallback {

    RecyclerView tvHeaderC;
    ArrayList<User> lstUsers;
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangkyxe);
        tvHeaderC = findViewById(R.id.rvList);
        LoadData();

        userAdapter = new UserAdapter(lstUsers, this);
        //
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        tvHeaderC.setAdapter(userAdapter);
        tvHeaderC.setLayoutManager(gridLayoutManager);
    }

    @Override
    public void onItemClick(String id) {
        Intent i = new Intent(this,detail.class);
        i.putExtra("userId", id);
        startActivity(i);}
    private void LoadData() {
        lstUsers = new ArrayList<>();
        lstUsers.add(new User("", "BMW", "BMW.png"));
        lstUsers.add(new User("", "Ford", "Ford.png"));
        lstUsers.add(new User("", "honda", "honda.png"));
        lstUsers.add(new User("", "Hyundai", "Hyundai.png"));

    }
}
