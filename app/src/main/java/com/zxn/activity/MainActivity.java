package com.zxn.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

/**
 * Activity中不设置布局文件,直接切换Fragment.
 * 研究难点:直接在Activity加载Frangment
 * Created by zxn on 2018-11-8 14:38:35.
 */
public class MainActivity extends AppCompatActivity {

    private static final int CONTENT_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //推荐
        //way1();

        //推荐
        //way2();

        //繁琐,不推荐
        way3();

    }

    private void way3() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(CONTENT_ID);
        setContentView(frameLayout);
        getSupportFragmentManager()
                .beginTransaction()
                .add(frameLayout.getId(), StoneCoinBuyFrag.newInstance(""))
                .commitNow();
    }

    private void way2() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, StoneCoinBuyFrag.newInstance(""))
                .commitAllowingStateLoss();
    }

    private void way1() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, StoneCoinBuyFrag.newInstance(""))
                //.commit();//ok
                //.commitNow()//ok
                //.commitNowAllowingStateLoss();//ok
                .commitAllowingStateLoss();//ok
    }
}
