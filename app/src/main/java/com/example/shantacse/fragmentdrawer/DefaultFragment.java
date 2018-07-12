package com.example.shantacse.fragmentdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DefaultFragment extends Fragment {


    public DefaultFragment() {
        // Required empty public constructor
    }


    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_default, container, false);

        return v;
    }

}
