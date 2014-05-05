package com.mackittipat.android_tab_navigation.app;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import com.mackittipat.android_tab_navigation.app.fragment.MyFragment;
import com.mackittipat.android_tab_navigation.app.tab.MyTabListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Notice that setContentView() is not used, because we use the root
        // android.R.id.content as the container for each fragment
        // setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tabHello = actionBar.newTab()
                .setText("Hello")
                .setTabListener(new MyTabListener(new MyFragment("Hello = sawadee")));
        ActionBar.Tab tabWorld = actionBar.newTab().setText("World")
                .setText("World")
                .setTabListener(new MyTabListener(new MyFragment("World = loke")));

        actionBar.addTab(tabHello);
        actionBar.addTab(tabWorld);
    }
}
