package com.example.user.musclebodybuilding.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.musclebodybuilding.R;

public class WorkoutAdapter extends BaseAdapter {

    Context context;
    String[] workoutNames;
    int[] workoutImages;
    LayoutInflater inflater;

    public WorkoutAdapter(Context context, String[] workoutNames, int[] workoutImages) {
        this.context = context;
        this.workoutNames = workoutNames;
        this.workoutImages = workoutImages;
    }

    @Override
    public int getCount() {
        return workoutImages.length;
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
            convertView=inflater.inflate(R.layout.workout_layout,parent,false);
        }

        ImageView imageView=convertView.findViewById(R.id.chest_image);
        imageView.setImageResource(workoutImages[position]);

        TextView textView=convertView.findViewById(R.id.workoutText);
        textView.setText(workoutNames[position]);

        return convertView;
    }
}
