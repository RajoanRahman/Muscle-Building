package com.example.user.musclebodybuilding.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.musclebodybuilding.R;

public class Split_WorkoutAdapter extends BaseAdapter {

    Context context;
    String[] splitWorkoutName;
    int[] splitWorkoutImages;
    LayoutInflater inflater;

    public Split_WorkoutAdapter(Context context, String[] splitWorkoutName, int[] splitWorkoutImages) {
        this.context = context;
        this.splitWorkoutName = splitWorkoutName;
        this.splitWorkoutImages = splitWorkoutImages;
    }

    @Override
    public int getCount() {
        return splitWorkoutImages.length;
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
            convertView=inflater.inflate(R.layout.split_workout,parent,false);
        }

        ImageView imageView=convertView.findViewById(R.id.splitWorkout_Image_Id);
        imageView.setImageResource(splitWorkoutImages[position]);

        TextView textView=convertView.findViewById(R.id.splitWorkout_textId);
        textView.setText(splitWorkoutName[position]);



        return convertView;
    }
}
