package com.example.librarymanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        signup = (TextView) findViewById(R.id.gotosignup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), signup.class));
                    }
                });
            }
        });
    }
}