package com.example.playfolio;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Login_Signup extends AppCompatActivity {
    Button b1  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup);

        b1 = findViewById(R.id.login_signup);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Login_Signup.this, First_Time_Landing_Page.class);
                        startActivity(i);
                    }
                }
        );
    }

}