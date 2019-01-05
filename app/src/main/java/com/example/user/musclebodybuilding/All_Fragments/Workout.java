package com.example.user.musclebodybuilding.All_Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.user.musclebodybuilding.Adapters.WorkoutAdapter;
import com.example.user.musclebodybuilding.MainActivity;
import com.example.user.musclebodybuilding.R;
import com.example.user.musclebodybuilding.WorkoutActivity.AbsActivity;
import com.example.user.musclebodybuilding.WorkoutActivity.BackActivity;
import com.example.user.musclebodybuilding.WorkoutActivity.BicepActivity;
import com.example.user.musclebodybuilding.WorkoutActivity.ChestActivity;
import com.example.user.musclebodybuilding.WorkoutActivity.LegsActivity;
import com.example.user.musclebodybuilding.WorkoutActivity.ShoulderActivity;
import com.example.user.musclebodybuilding.WorkoutActivity.StretchingActivty;
import com.example.user.musclebodybuilding.WorkoutActivity.TricepActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Workout extends Fragment {

    View view;
    GridView gridView;
    String[] workoutNames={"CHEST","BICEP","TRICEP","BACK","SHOULDER","ABS","LEGS","STRETCH"};
    int[] workoutImages={R.drawable.chest,R.drawable.bicep,R.drawable.tricep,R.drawable.back,
    R.drawable.shoulder,R.drawable.abs,R.drawable.legs,R.drawable.strechone};

    public Workout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_workout, container, false);

        gridView=(GridView)view.findViewById(R.id.workouts_gridView);

        WorkoutAdapter workoutAdapter=new WorkoutAdapter(getContext(),workoutNames,workoutImages);
        gridView.setAdapter(workoutAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent1=new Intent(getContext(),ChestActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2=new Intent(getContext(),BicepActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3=new Intent(getContext(),TricepActivity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4=new Intent(getContext(),BackActivity.class);
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5=new Intent(getContext(),ShoulderActivity.class);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6=new Intent(getContext(),AbsActivity.class);
                        startActivity(intent6);
                        break;
                    case 6:
                        Intent intent7=new Intent(getContext(),LegsActivity.class);
                        startActivity(intent7);
                        break;
                    case 7:
                        Intent intent8=new Intent(getContext(),StretchingActivty.class);
                        startActivity(intent8);
                        break;
                }
            }
        });

        return view;
    }

}
