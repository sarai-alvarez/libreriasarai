package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mylibrary.Adapters.OmboardingAdapter;


public class MainActivity1 extends AppCompatActivity {


    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        //initializeComponents
        _initializeComponents();

        //initializeAdapter
        _initializeFragmentAdapter();
    }
    public void _initializeComponents(){
        viewPagerContainer = findViewById(R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter() {
        OmboardingAdapter adapter = new OmboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }
}