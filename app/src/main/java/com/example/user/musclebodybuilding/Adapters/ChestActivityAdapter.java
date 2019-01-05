package com.example.user.musclebodybuilding.Adapters;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.musclebodybuilding.R;

import static android.media.CamcorderProfile.get;
import static android.widget.Toast.*;

public class ChestActivityAdapter extends BaseAdapter {

    Context context;
    int[] workoutImages;
    String[] workoutNames;
    LayoutInflater inflater;


    public ChestActivityAdapter(Context context, int[] workoutImages, String[] workoutNames) {
        this.context = context;
        this.workoutImages = workoutImages;
        this.workoutNames = workoutNames;
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
            convertView=inflater.inflate(R.layout.single_part_design,parent,false);
        }

        ImageView imageView=(convertView).findViewById(R.id.allworkout_imageId);
        imageView.setImageResource(workoutImages[position]);

        TextView textView=(convertView ).findViewById(R.id.allworkout_textId);
        textView.setText(workoutNames[position]);

        return convertView;
    }

   /* @NonNull
    @Override
    public WorkoutViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(context).inflate(R.layout.single_part_design,viewGroup,false);

        // Create a object of WorkoutViewHolder class and Initialize the "view" parameter
        WorkoutViewHolder workoutViewHolder=new WorkoutViewHolder(view);

        return workoutViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutViewHolder workoutViewHolder, int i) {



        workoutViewHolder.imageView.setImageResource(workoutImages[i]);
        workoutViewHolder.textView.setText(workoutNames[i]);



    }

    @Override
    public int getItemCount() {
        return workoutImages.length;
    }

    // In this ViewHolder class I findOut my Child View design and Id.
    public class WorkoutViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public WorkoutViewHolder(@NonNull final View itemView) {
            super(itemView);

            imageView=(itemView).findViewById(R.id.allworkout_imageId);
            textView=(itemView ).findViewById(R.id.allworkout_textId);


        }
    }*/
}



