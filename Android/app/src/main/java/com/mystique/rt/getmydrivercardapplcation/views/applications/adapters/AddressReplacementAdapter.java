

package com.mystique.rt.getmydrivercardapplcation.views.applications.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.ChangeFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.DrivingLicensePictureFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.OldCardFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.PersonalInfoFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.SelfieFragment;
import com.mystique.rt.getmydrivercardapplcation.views.applications.fragments.SignDeclarationFragment;
/**
 * <h1>AddressReplacement Adapter class</h1>
 *
 * <b>Description: </b> Organises LossOrTheft Activity
 * to slider view of needed Fragments (exp. Personal information fragment etc.)
 *
 *
 * @author  Mystique Team
 * @version 1.0
 * @since   2018-11-12
 */

public class AddressReplacementAdapter extends FragmentStatePagerAdapter {

    public AddressReplacementAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Driver";
            case 1: return "Photo"; // trying to combine in one camera 2 pictures
            case 2: return "Photo";
            case 3: return "Other";
            case 4: return "New";
            case 5: return "Sign";
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
            case 3: return new OldCardFragment();
            case 4: return new ChangeFragment();
            case 5: return new SignDeclarationFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }
}

