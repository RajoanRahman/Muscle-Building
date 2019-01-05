package com.example.user.musclebodybuilding.ChestWorkout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.musclebodybuilding.R;

public class DipChest extends AppCompatActivity{

    private AnimationDrawable batAnimation;
    private ImageView dipChest;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_chest_workouts);

        textView=findViewById(R.id.all_chest_workoutText);
        // textView.setText(R.string.);

        dipChest=findViewById(R.id.all_chest_workout_imageId);
        dipChest.setImageResource(R.drawable.dip_chest);

        AnimationDrawable dipChestDrawable=(AnimationDrawable)dipChest.getDrawable();
        dipChestDrawable.start();



    }
}
