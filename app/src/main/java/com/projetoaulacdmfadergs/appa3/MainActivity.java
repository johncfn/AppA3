package com.projetoaulacdmfadergs.appa3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import fragments.PageFragment1;
import fragments.PageFragment2;
import fragments.PageFragment3;
import fragments.PageFragment4;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());
        list.add(new PageFragment4());

        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePage(getSupportFragmentManager(),list);

        pager.setAdapter(pagerAdapter);
    }
}
