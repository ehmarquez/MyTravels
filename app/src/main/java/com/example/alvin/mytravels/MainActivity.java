package com.example.alvin.mytravels;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set content of activity to use activity main
        setContentView(R.layout.activity_main);

        //Find view pager from activity main xml to allow for swiping fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Create new adapter that knows which fragment to show on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);

        //Set adapter onto the view pager found earlier
        viewPager.setAdapter(adapter);

        //Add tabs to let user know of categories
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        //And setup with above viewpager
        tabLayout.setupWithViewPager(viewPager);


    }
}
