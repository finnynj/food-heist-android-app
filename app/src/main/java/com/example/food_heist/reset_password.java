package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class reset_password extends AppCompatActivity {
    private EditText new_password;
    private EditText confirm_password;
    private Button reset_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        new_password = findViewById(R.id.new_password);
        confirm_password = findViewById(R.id.confirm_password);
        reset_button = findViewById(R.id.reset_button);

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_page = new Intent(getApplicationContext(), login_signup_activity.class);
                startActivity(login_page);
            }
        });

    }
}
