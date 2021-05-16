package com.example.odev2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Layout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {

    private Toolbar actionbar;
    private ViewPager vpMain;
    private TabLayout tabsMain;
    private TabsAdapter tabAdapter;

    public void init() {

        actionbar = (Toolbar) findViewById(R.id.actionBar);
        setSupportActionBar(actionbar);
        getSupportActionBar().setTitle(R.string.app_name);

        vpMain =(ViewPager) findViewById(R.id.vpMain);
        tabAdapter = new TabsAdapter(getSupportFragmentManager());
        vpMain.setAdapter(tabAdapter);

        tabsMain =(TabLayout) findViewById(R.id.tabsMain);
        tabsMain.setupWithViewPager(vpMain);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }
}