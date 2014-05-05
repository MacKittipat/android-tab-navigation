package com.mackittipat.android_tab_navigation.app.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mackittipat.android_tab_navigation.app.R;

public class MyFragment extends Fragment {

    private String msg;

    public MyFragment(String msg) {
        this.msg = msg;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Set fragment's view
        View view = inflater.inflate(R.layout.tab_fragment, container, false);
        // Set msg to TextView
        TextView txtViewDetail = (TextView) view.findViewById(R.id.txtv_detail);
        txtViewDetail.setText(msg);
        return view;
    }
}
