package com.example.user.musclebodybuilding.WorkoutActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.user.musclebodybuilding.R;

public class BicepActivity extends AppCompatActivity {

    Toolbar myToolbar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep);

        myToolbar=findViewById(R.id.chestToolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Bicep Workouts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        myToolbar.setTitleTextColor(getResources().getColor(R.color.tittleColor));

        recyclerView=findViewById(R.id.bicep_recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
