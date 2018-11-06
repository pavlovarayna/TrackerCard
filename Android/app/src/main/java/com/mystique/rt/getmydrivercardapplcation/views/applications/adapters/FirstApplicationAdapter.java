package com.mystique.rt.getmydrivercardapplcation.views.applications.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.DrivingLicensePictureFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.PersonalInfoFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.SelfieFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.SignDeclarationFragment;

public class FirstApplicationAdapter extends FragmentStatePagerAdapter {


    public FirstApplicationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Personal Info";
            case 1: return "Selfie";
            case 2: return "Driving Licence Pic";
            case 3: return "Declaration and sign";
            default: return null;
        }
    }

    //new fragments added
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new PersonalInfoFragment();
            case 1: return new SelfieFragment();
            case 2: return new DrivingLicensePictureFragment();
            case 3: return new SignDeclarationFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
