package com.example.user.musclebodybuilding;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import com.example.user.musclebodybuilding.Adapters.ViewPagerAdapter;
import com.example.user.musclebodybuilding.All_Fragments.Home_Workout;
import com.example.user.musclebodybuilding.All_Fragments.Split_Workout;
import com.example.user.musclebodybuilding.All_Fragments.Workout;
import com.example.user.musclebodybuilding.All_Fragments.Workout_Plan;

public class MainActivity extends AppCompatActivity {

    Toolbar myToolbar;
    TabLayout myTabLayout;
    ViewPager myViewPager;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar=findViewById(R.id.my_toolbar_layout);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Bodybuilding");
        myToolbar.setTitleTextColor(getResources().getColor(R.color.tittleColor));

        myTabLayout=findViewById(R.id.navigationTabLayout_id);
        myViewPager=findViewById(R.id.myViewPagerId);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Workout(),"Workouts");
        viewPagerAdapter.addFragment(new Workout_Plan(),"Workout Plan");
        viewPagerAdapter.addFragment(new Split_Workout(),"Split Workout");
        viewPagerAdapter.addFragment(new Home_Workout(),"Home Workout");


        myViewPager.setAdapter(viewPagerAdapter);
        myTabLayout.setupWithViewPager(myViewPager);

        myTabLayout.getTabAt(0).setIcon(R.drawable.gym);
        myTabLayout.getTabAt(1).setIcon(R.drawable.gym_plan);
        myTabLayout.getTabAt(2).setIcon(R.drawable.gym_two);
        myTabLayout.getTabAt(3).setIcon(R.drawable.home_workout);



    }
}
