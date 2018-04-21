package com.tree.bigheaderplayer;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity
        extends AppCompatActivity
{

    @BindView(R.id.common_toolbar_title_tv)
    TextView             mCommonToolbarTitleTv;
    @BindView(R.id.common_toolbar)
    Toolbar              mCommonToolbar;
    @BindView(R.id.fragment_group)
    FrameLayout          mFragmentGroup;
    @BindView(R.id.main_floating_action_btn)
    FloatingActionButton mMainFloatingActionBtn;
    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView mBottomNavigationView;
    @BindView(R.id.nav_view)
    NavigationView       mNavView;
    @BindView(R.id.drawer_layout)
    DrawerLayout         mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }


}
