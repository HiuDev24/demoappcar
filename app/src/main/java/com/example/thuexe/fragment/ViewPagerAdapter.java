package com.example.thuexe.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new KhamPha();
            case 1:
                return new ThongBao();
            case 2:
                return new Chuyen();
            case 3:
                return new HoTro();
            case 4 :
                return new CaNhan();
            default:
                return new KhamPha();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
