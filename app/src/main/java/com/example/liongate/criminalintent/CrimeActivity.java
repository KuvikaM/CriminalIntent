package com.example.liongate.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
