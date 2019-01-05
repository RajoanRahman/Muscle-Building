package com.example.user.musclebodybuilding.ChestWorkout;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.musclebodybuilding.R;

public class Butterfly extends AppCompatActivity {


    private ImageView butterflyImage;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_chest_workouts);

        textView=findViewById(R.id.all_chest_workoutText);
        textView.setText(R.string.butterfly);

        butterflyImage=findViewById(R.id.all_chest_workout_imageId);

        butterflyImage.setImageResource(R.drawable.butterfly_animationt);
        AnimationDrawable butterfly=(AnimationDrawable)butterflyImage.getDrawable();
        butterfly.start();
    }


}
