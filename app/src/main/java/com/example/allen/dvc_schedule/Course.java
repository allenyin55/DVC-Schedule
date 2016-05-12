package com.example.allen.dvc_schedule;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by haileythegooner on 5/11/16.
 */

public class Course extends AppCompatActivity {
    private Context context;
    private static boolean check;
    private final static String TAG = "course";

//    public enum WEEK {
//        SUNDAY = 0,
//        MONDAY = 1,
//        TUSEDAY = 2,
//    }
//    public String courseTitle;
//    public Date courseTime1[2];
//    public Date courseTime2[2];
    public TimeTableModel timeTableModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        timeTableModel = new TimeTableModel();
        //courseTitle = savedInstanceState.getString("title");
        timeTableModel.setName("MATH-193");
        timeTableModel.setStarttime("0900");
        timeTableModel.setEndtime("1030");
        timeTableModel.setWeek(1);

        context = this;
        TextView textViewCourseTitle = (TextView) findViewById(R.id.textViewCourseTitle);
        TextView textViewCourseTime = (TextView) findViewById(R.id.textViewCourseTime);
        textViewCourseTitle.setText(timeTableModel.getName());

        String startTime = timeTableModel.getStarttime();
        String endTime = timeTableModel.getEndtime();
        int week = timeTableModel.getWeek();
        String stringWeek = convertWeek(week);
        String formatStartTime = formatTime(startTime);
        String formatEndTime = formatTime(endTime);
        String timeString = stringWeek +" "+ formatStartTime +"-"+ formatEndTime;
        textViewCourseTime.setText( timeString);




    }

    String convertWeek(int intWeek){
        String week;
        switch(intWeek){
            case 0:
                week = "SUN";
                break;
            case 1:
                week = "MON";
                break;
            case 2:
                week = "TUE";
                break;
            case 3:
                week = "WED";
                break;
            case 4:
                week = "THU";
                break;
            case 5:
                week = "FRI";
                break;
            case 6:
                week = "SAT";
                break;
            default:
                week = "";

        }
        return week;

    }
    String formatTime(String time){
        String hour = time.substring(0,2);
        String minute = time.substring(2,4);

        return hour+ ":" + minute;



    }
}


