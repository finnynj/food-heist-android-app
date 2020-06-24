package com.example.food_heist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class slider_adapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutinflater;

    //constructor of adapter class
    public slider_adapter(Context context){
        this.context=context;
    }

    //init array of layouts
    int[] back={R.layout.slide_layout1,R.layout.slide_layout2,R.layout.slide_layout3};


    @Override
    public int getCount() {
        return back.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==  (ConstraintLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutinflater = (LayoutInflater) context .getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutinflater.inflate(back[position], container, false);
        container.addView(view);
        return  view;
    }

    public void  destroyItem(ViewGroup container, int Position, Object object){
        container.removeView((ConstraintLayout)object);
    }




         /*public int[] slide_images = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
    };*/

    /*public String[] heading = {
            "Discover The Best Restaurant",
            "Scan And Choose Your Order",
            "Fast Delivery At Your Table",
    };

    public String[] description = {
      "Search and choose your favourite restaurant",
      "Get your menu directly on your mobile",
      "Place your order and get it delivered within estimated time",
    };*/



/*        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images);
        TextView slideHeading = (TextView) view.findViewById(R.id.heading);
        TextView slidedescription = (TextView) view.findViewById(R.id.description);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(heading[position]);
        slidedescription.setText(description[position]);*/



}
