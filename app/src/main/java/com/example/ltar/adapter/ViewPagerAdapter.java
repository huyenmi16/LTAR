package com.example.ltar.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.ltar.fragment.FragmentCreate;
import com.example.ltar.fragment.FragmentHome;
import com.example.ltar.fragment.FragmentNotification;
import com.example.ltar.fragment.FragmentUser;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private int pageNum;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0: return new FragmentHome();
           case 1: return new FragmentNotification();
           case 2: return new FragmentCreate();
           case 3: return new FragmentUser();
           default:return new FragmentHome();


       }

    }

    @Override
    public int getCount() {
        return pageNum;
    }
}
