package com.mackittipat.android_tab_navigation.app.tab;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.util.Log;

public class MyTabListener implements ActionBar.TabListener {

    private Fragment fragment;

    public MyTabListener(Fragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("MyTabListener", "onTabSelected " + tab.getText().toString());
        fragmentTransaction.replace(android.R.id.content, fragment);
        // fragmentTransaction.replace(R.id.layout_main, fragment);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("MyTabListener", "onTabUnselected " + tab.getText().toString());
        // fragmentTransaction.remove(fragment);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("MyTabListener", "onTabReselected " + tab.getText().toString());
    }
}
