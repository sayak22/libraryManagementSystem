package com.example.librarymanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        login = (TextView) findViewById(R.id.gotologin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        startActivity(new Intent(getApplicationContext(),login.class));
            }
        });
    }
}