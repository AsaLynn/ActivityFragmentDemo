package com.zxn.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 原石货币购买
 * Created by zxn on 2018-11-8 14:24:21.
 */
public class StoneCoinBuyFrag extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public StoneCoinBuyFrag() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment StoneCoinBuyFrag.
     */
    public static StoneCoinBuyFrag newInstance(String param1) {
        StoneCoinBuyFrag fragment = new StoneCoinBuyFrag();
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
        return inflater.inflate(R.layout.fragment_stone_coin_buy, container, false);
    }
}
