package com.example.luke.myfirstappagain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BileCaje extends Fragment {

    public BileCaje() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bile_caje, container, false);

        // Inflate the layout for this fragment
        if (container != null) {
            container.removeAllViews();
        }
        return view;
    }
}
