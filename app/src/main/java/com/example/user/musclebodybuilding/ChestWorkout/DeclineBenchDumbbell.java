package com.example.user.musclebodybuilding.ChestWorkout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.musclebodybuilding.R;

public class DeclineBenchDumbbell extends AppCompatActivity {

    private AnimationDrawable batAnimation;
    private ImageView declineBenchDumbbell;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_chest_workouts);

        textView=findViewById(R.id.all_chest_workoutText);
       // textView.setText(R.string.);

        declineBenchDumbbell=findViewById(R.id.all_chest_workout_imageId);
        declineBenchDumbbell.setImageResource(R.drawable.decline_bench_dumbbell_press);

        AnimationDrawable declineBenchDumbbellDrawable=(AnimationDrawable)declineBenchDumbbell.getDrawable();
        declineBenchDumbbellDrawable.start();



    }
}
