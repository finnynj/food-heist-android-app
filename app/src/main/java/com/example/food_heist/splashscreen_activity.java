package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen_activity extends AppCompatActivity {

    //declare variables
    private ImageView splashimage;
    //private TextView splashtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //init variables
        splashimage = findViewById(R.id.splash_logo);
        //splashtext = findViewById(R.id.splash_text);

        //start animation
        Animation splash_anim = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        splashimage.startAnimation(splash_anim);
        //splashtext.startAnimation(splash_anim);

        //switch to main activity
        final Intent intent = new Intent(this,MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                   sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
