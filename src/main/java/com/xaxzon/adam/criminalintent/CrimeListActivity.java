package com.xaxzon.adam.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Adam on 11/25/2016.
 */


public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
