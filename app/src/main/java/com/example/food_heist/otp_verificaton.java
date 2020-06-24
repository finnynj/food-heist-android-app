package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otp_verificaton extends AppCompatActivity {
    private Button reset_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verificaton);

        reset_button = findViewById(R.id.reset_button);
        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent user_dashboard = new Intent(getApplicationContext(), com.example.food_heist.user_dashboard.class);
                startActivity(user_dashboard);
            }
        });
    }
}
