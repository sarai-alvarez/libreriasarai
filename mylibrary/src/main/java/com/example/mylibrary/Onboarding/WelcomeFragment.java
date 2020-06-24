package com.example.mylibrary.Onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mylibrary.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    private TextView textNext;
    private ViewPager viewPager;
    private View view;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //initialize viewpager from main activity
        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next
        _addClickTextNext();

        //return
        return view;
        //return inflater.inflate(R.layout.fragment_welcome, container, false);

    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNext = view.findViewById(R.id.textNextWelcome);

    }

    public void _addClickTextNext() {
        textNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }
}

