package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class login_signup_activity extends AppCompatActivity {

    //declare variables for all views
    private Button login_button;
    private Button signup_button;
    private EditText user_no;
    private EditText password;
    private ImageView password_eye;
    private int image[] = {R.drawable.eye_vector,R.drawable.ic_visibility_off_black_24dp};
    private TextView forgot_password;
    private TextView textview_signup;
    private Button verify_button;
   // private LinearLayout login2layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup_activity);

        //init this page views
        login_button = findViewById(R.id.login);
        signup_button = findViewById(R.id.signup);



        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(login_signup_activity.this, R.style.BottomSheetDialogTheme);
                final View bottomsheetview = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.activity_login2_activity,(LinearLayout)findViewById(R.id.login2_layout));

                //init the views of bottomsheet
                password_eye = bottomsheetview.findViewById(R.id.password_eye);
                password = bottomsheetview.findViewById(R.id.user_password);
                user_no = bottomsheetview.findViewById(R.id.user_no);
                forgot_password = bottomsheetview.findViewById(R.id.forgot_password);
                textview_signup = bottomsheetview.findViewById(R.id.textView_signup);


                //onClickListener for bottomsheet views
                password_eye.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(view == password_eye ){
                            if(password.getInputType()==(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD)){
                                password.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                                password_eye.setImageResource(image[1]);
                            }
                            else if(password.getInputType()==(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)){
                                password.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                                password_eye.setImageResource(image[0]);
                            }
                        }

                    }
                });

                forgot_password.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent login2_activity = new Intent(getApplicationContext(), forgot_password.class);
                        startActivity(login2_activity);
                    }
                });

                bottomsheetview.findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                       /*if (user_no.getText().equals("11223344") && password.getText().equals("admin")) {*/
                            Intent login2_activity = new Intent(getApplicationContext(), user_dashboard.class);
                            startActivity(login2_activity);
                       /* }
                        else{
                            Toast toast=Toast. makeText(getApplicationContext(),"Invelid User Id or Password",Toast. LENGTH_SHORT);
                            toast. setMargin(100,50);
                            toast. show();
                        }*/
                    }
                });

                textview_signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(),signup2_activity.class);
                        startActivity(intent);
                    }
                });

                bottomSheetDialog.setContentView(bottomsheetview);
                bottomSheetDialog.show();
            }
        });
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),signup2_activity.class);
                startActivity(intent);

            }
        });
    }

}



/*package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputType;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login2_activity extends AppCompatActivity {

    private TextView forgot;
    private EditText user_no;
    private EditText user_password;
    private CheckBox remember_me;
    private Button login_btn;
    private  TextView textView_sign_up;
    private ImageView password_eye;
    private int image[] = {R.drawable.eye_vector,R.drawable.ic_visibility_off_black_24dp};


   // @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2_activity);

        //forgot = findViewById(R.id.forgot_pass);
        //SpannableString spannableString = new SpannableString("Forgot Your Password?");
        //spannableString.setSpan(new UnderlineSpan(),0,spannableString.length(),0);
        //forgot.setText(spannableString);

        user_no=findViewById(R.id.user_no);
        user_password=findViewById(R.id.user_password);
      //  remember_me=findViewById(R.id.remember_me);
        login_btn=findViewById(R.id.login_btn);
        textView_sign_up=findViewById(R.id.textView_sign_up);
        password_eye=findViewById(R.id.password_eye);



        password_eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == password_eye){
                    if(user_password.getInputType()==(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD)){
                        user_password.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        password_eye.setImageResource(image[1]);
                    }
                    else if(user_password.getInputType()==(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD)){
                        user_password.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                        password_eye.setImageResource(image[0]);
                    }
                }
            }
        });




    }
}*/
