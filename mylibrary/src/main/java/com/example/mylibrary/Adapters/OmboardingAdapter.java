package com.example.mylibrary.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mylibrary.Onboarding.FaceDetectionFragment;
import com.example.mylibrary.Onboarding.LoginFragment;
import com.example.mylibrary.Onboarding.TextRecognitionFragment;
import com.example.mylibrary.Onboarding.WelcomeFragment;

public class OmboardingAdapter extends FragmentPagerAdapter {


    public OmboardingAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch(position){
            case 0:
                return new WelcomeFragment();

            case 1:
                return  new FaceDetectionFragment();

            case 2:
                return  new TextRecognitionFragment();
            case 3:
                return  new LoginFragment();

            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}
