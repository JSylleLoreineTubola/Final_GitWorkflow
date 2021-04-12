package com.example.softwaredesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

public class bible extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);

        viewPager = findViewById(R.id.viewPager);

        IntroAdapter adapter = new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}