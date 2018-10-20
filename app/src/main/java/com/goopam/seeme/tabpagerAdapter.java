package com.goopam.seeme;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabpagerAdapter extends FragmentStatePagerAdapter {

    String[] tabarray = new String[] {"accueil","activites","besoins","compte"};
    Integer tabnumber = 4;

    public tabpagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {

        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {
       switch (position)
       {
           case 0:
               accueil accueil1 = new accueil();
               return accueil1;
           case 1:
               activites activites2 = new activites();
               return activites2;
           case 2:
               besoins besoins3 = new besoins();
               return besoins3;
           case 3:
               compte compte4 = new compte();
               return compte4;

       }

        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}


