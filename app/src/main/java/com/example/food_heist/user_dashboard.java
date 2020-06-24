package com.example.food_heist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class user_dashboard extends AppCompatActivity {

    private Toolbar toolbar;
    ViewPager viewPager;
    Adapter homeCard_adapter;
    List<model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        models = new ArrayList<>();
        models.add(new model(R.drawable.brochure));
        models.add(new model(R.drawable.sticker));
        models.add(new model(R.drawable.poster));
        models.add(new model(R.drawable.namecard));

        homeCard_adapter = (Adapter) new homeCard_adapter(models, this);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter((PagerAdapter) homeCard_adapter);
        viewPager.setPadding(130, 0, 130,0 );

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (homeCard_adapter.getCount() -1) && position < (colors.length -1 ) ) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }
                else {
                    viewPager.setBackgroundColor(colors[colors.length -1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }




}

