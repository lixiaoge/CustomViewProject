package com.ssdk.custom.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ssdk.custom.R;
import com.ssdk.custom.ui.adapter.MyPagerAdapter;
import com.ssdk.custom.ui.adapter.MyPagerAdapter1;

import java.util.ArrayList;

/**
 * Created by zlc on 2018/7/14.
 */

public class ViewGroupFragment extends BaseFragment{

    private TabLayout mTab;
    private ViewPager mViewpager;
    private ArrayList<Fragment> mFragments;
    private String[] mTitles = {
        "自定义布局","流式布局","奥运五环","游标卡尺"
    };

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_viewgroup;
    }

    @Override
    protected void initView() {
        super.initView();
        mTab = findView(R.id.tab1);
        mViewpager = findView(R.id.viewpager1);
    }

    @Override
    protected void initData() {
        mFragments = new ArrayList<>();
        addFragments();
        MyPagerAdapter adapter = new MyPagerAdapter(getChildFragmentManager());
        adapter.setFragments(mFragments);
        adapter.setTitles(mTitles);
        mViewpager.setAdapter(adapter);
        mTab.setupWithViewPager(mViewpager);
    }

    private void addFragments() {
        mFragments.add(new MyLayoutFragment());
        mFragments.add(new FlowLayoutFragment());
        mFragments.add(new OlymicRingsFragment());
        mFragments.add(new RangeSeekBarFragment());
    }

    @Override
    public void initListener() {
        super.initListener();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
