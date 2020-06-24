package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup2_activity extends AppCompatActivity {

    //Declare variables
    private Button verify;
    private EditText username;
    private EditText userno;
    private EditText npassword;
    private EditText cnpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2_activity);

        username = findViewById(R.id.nuser_name);
        userno = findViewById(R.id.user_no);
        npassword = findViewById(R.id.npassword);
        cnpassword = findViewById(R.id.cnpassword);
        verify = findViewById(R.id.verify_button);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otp_verify = new Intent(getApplicationContext(), otp_verificaton.class);
                startActivity(otp_verify);
            }
        });
    }
}
