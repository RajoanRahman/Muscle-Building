package com.example.user.musclebodybuilding.WorkoutActivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.musclebodybuilding.Adapters.ChestActivityAdapter;
import com.example.user.musclebodybuilding.ChestWorkout.Butterfly;
import com.example.user.musclebodybuilding.ChestWorkout.Cross_Cable;
import com.example.user.musclebodybuilding.R;

public class ChestActivity extends AppCompatActivity {

    Toolbar myToolbar;
    ListView listView;

    String[] workoutNames={"Butterfly","Cross Cable","Decline Bench Barbell Press","Decline Bench Dumbbell Press","DipChest","Flat Bench Dumbbell Press","Dumbbell Flies","Flat Bench Barbell Press",
            "Incline Barbell Press","Incline Dumbbell Flies","Incline Dumbbell Press","Machine Chest Press","Dumbbell Pullover"
     };

    int[] workoutImages={R.drawable.buttterfly,R.drawable.crosscable,R.drawable.declinebarbeel,R.drawable.declinedumbell,R.drawable.dipchest,R.drawable.dumbellbench,
    R.drawable.dumbellfly,R.drawable.flatbenchone,R.drawable.inclinebrabellone,R.drawable.inclinedumbellflyone,R.drawable.inclinedumbellpressone,
    R.drawable.machinechest,R.drawable.dumbellpullover};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        myToolbar=findViewById(R.id.chestToolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Chest Workouts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        myToolbar.setTitleTextColor(getResources().getColor(R.color.tittleColor));


        listView=findViewById(R.id.chest_listView);

        ChestActivityAdapter chestActivityAdapter=new ChestActivityAdapter(this,workoutImages,workoutNames);

        listView.setAdapter(chestActivityAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent butterfly=new Intent(ChestActivity.this,Butterfly.class);
                        startActivity(butterfly);
                        break;
                    case 1:
                        Intent crossCable=new Intent(ChestActivity.this,Cross_Cable.class);
                        startActivity(crossCable);
                        break;
                }
            }
        });



    }
}
