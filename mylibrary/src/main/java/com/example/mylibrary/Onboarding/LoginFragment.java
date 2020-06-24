package com.example.mylibrary.Onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mylibrary.R;


/**
 * A simple {@link Fragment} subclass.
 */

public class LoginFragment extends Fragment implements View.OnClickListener {
    private ViewPager viewPager;
    private View view;
    private TextView tvPrev;
    private Button btLogin, btRegister;
    private EditText etUsername, etPass;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        initializeInflater(inflater, container);
        initializeComponents();
        return view;
    }

    private void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    private void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        tvPrev = view.findViewById(R.id.tvPrevLogin);
        tvPrev.setOnClickListener(this);
        etUsername = view.findViewById(R.id.etUsername);
        etPass = view.findViewById(R.id.etPassword);
        btLogin = view.findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
        btRegister = view.findViewById(R.id.btRegister);
        btRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {




        }
    }

    /**
     * @param {String} username
     * @param {String} password
     * @name login
     * @desc login activity
     */


    /**
     * @param {String} username
     * @param {String} password
     * @return {boolean}
     * @name checkValues
     * @desc check username and password values
     */
    private boolean checkValues(String username, String password) {
        return !(username.equals("") || password.equals(""));
    }

    /**
     * @param {String} msg
     * @name showMsg
     * @desc show toast message
     */
    private void showMsg(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
