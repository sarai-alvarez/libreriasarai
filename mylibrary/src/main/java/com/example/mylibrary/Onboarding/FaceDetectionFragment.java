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
public class FaceDetectionFragment extends Fragment {
    private TextView textNext;
    private ViewPager viewPager;
    private View view;


    private TextView textAnt;
    private ViewPager viewPager2;


    public FaceDetectionFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);
        _initialize();
        _addClickTextNext();
        //-------------------
        _initialize2();
        _addClickTextAnt();

        return view;
        //return inflater.inflate(R.layout.fragment_welcome, container, false);

    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_face_detection, container, false);
    }




    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNext = view.findViewById(R.id.textNextTextD);
    }

    public void _addClickTextNext() {
        textNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
    }
    //------------------------------------------------
    public void _initialize2() {
        viewPager2 = getActivity().findViewById(R.id.viewPagerContainer);
        textAnt = view.findViewById(R.id.textPrevTextD);
    }

    public void _addClickTextAnt() {
        textAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager2.setCurrentItem(0);
            }
        });
    }


}

