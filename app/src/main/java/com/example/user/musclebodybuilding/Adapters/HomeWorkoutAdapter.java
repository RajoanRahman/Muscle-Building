package com.example.user.musclebodybuilding.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.user.musclebodybuilding.R;

public class HomeWorkoutAdapter extends BaseAdapter {

    Context context;
    String[] homeWorkoutWeekDays;

    LayoutInflater inflater;

    public HomeWorkoutAdapter(Context context, String[] homeWorkoutWeekDays) {
        this.context = context;
        this.homeWorkoutWeekDays = homeWorkoutWeekDays;
    }

    @Override
    public int getCount() {
        return homeWorkoutWeekDays.length;
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
            convertView=inflater.inflate(R.layout.home_workout,parent,false);
        }

        TextView textView=convertView.findViewById(R.id.homeWorkout_textId);
        textView.setText(homeWorkoutWeekDays[position]);

        return convertView;
    }
}
