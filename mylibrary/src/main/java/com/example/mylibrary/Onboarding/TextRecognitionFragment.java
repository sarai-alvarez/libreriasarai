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
public class TextRecognitionFragment extends Fragment {

    private View view;

    private TextView textAnt,textNextIns;
    private ViewPager viewPager2;
    public TextRecognitionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);
        _initialize2();
        _addClickTextAnt();
        return view;
    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_text_recognition, container, false);
    }
    //------------------------------------------------
    public void _initialize2() {
        viewPager2 = getActivity().findViewById(R.id.viewPagerContainer);
        textAnt = view.findViewById(R.id.textPrevIns);
        textNextIns = view.findViewById(R.id.textNextIns);
    }

    public void _addClickTextAnt() {
        textAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager2.setCurrentItem(1);
            }
        });
        textNextIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager2.setCurrentItem(3);

            }
        });
    }
}
