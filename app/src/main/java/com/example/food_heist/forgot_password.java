package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class forgot_password extends AppCompatActivity {

    private EditText resend_no;
    private Button fp_number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        resend_no = findViewById(R.id.new_password);
        fp_number = findViewById(R.id.reset_button);

        fp_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reset_password = new Intent(getApplicationContext(), reset_password.class);
                startActivity(reset_password);
            }
        });
    }

}
