package com.example.liongate.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Liongate on 22.08.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
