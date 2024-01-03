package com.example.playfolio;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class First_Time_Landing_Page extends AppCompatActivity {
    Button b1  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_time_landing_page);

        b1 = findViewById(R.id.first_time_landing_page);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(First_Time_Landing_Page.this, Login_Signup.class);
                        startActivity(i);
                    }
                }
        );
    }

}