package com.example.user.musclebodybuilding.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.musclebodybuilding.R;

public class WorkoutPlanAdapter extends BaseAdapter {
    Context context;
    String[] workoutPlanName;
    int[] workoutPlanImages;
    LayoutInflater inflater;

    public WorkoutPlanAdapter(Context context, String[] workoutPlanName, int[] workoutPlanImages) {
        this.context = context;
        this.workoutPlanName = workoutPlanName;
        this.workoutPlanImages = workoutPlanImages;
    }

    @Override
    public int getCount() {
        return workoutPlanImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){

            inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.workout_plan,parent,false);
        }

        ImageView imageView=convertView.findViewById(R.id.workoutPlanImage_Id);
        imageView.setImageResource(workoutPlanImages[position]);

        TextView textView=convertView.findViewById(R.id.workout_plan_textId);
        textView.setText(workoutPlanName[position]);


        return convertView;
    }
}
