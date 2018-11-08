package com.zxn.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 原石货币兑换!
 * Created by zxn on 2018-11-8 14:25:05.
 */
public class StoneCoinChangeFrag extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;


    public StoneCoinChangeFrag() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment StoneCoinChangeFrag.
     */
    public static StoneCoinChangeFrag newInstance(String param1) {
        StoneCoinChangeFrag fragment = new StoneCoinChangeFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_stone_coin_change, container, false);
    }

}
