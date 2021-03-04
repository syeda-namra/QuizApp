package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MartFragment extends Fragment {

    public MartFragment() {
        // Required empty public constructor
    }


    public static MartFragment newInstance() {
      MartFragment fragment = new MartFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }


}