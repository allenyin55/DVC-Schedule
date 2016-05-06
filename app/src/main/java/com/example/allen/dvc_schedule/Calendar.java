package com.example.allen.dvc_schedule;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class Calendar extends AppCompatActivity {
    private TimeTableView mTimeTableView;
    private List<TimeTableModel> mList;
    public String className, proName;
    public int startTime, endTime, weekDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        mList = new ArrayList<TimeTableModel>();
        mTimeTableView = (TimeTableView) findViewById(R.id.main_timetable_ly);}


    @Override
    protected void onStart(){
        super.onStart();
        Bundle addClass = getIntent().getExtras();

        if (addClass != null) {
            className = addClass.getString("className");
            proName = addClass.getString("proName");
            startTime = addClass.getInt("startTime");
            endTime = addClass.getInt("endTime");
            weekDay = addClass.getInt("weekDay");


            mList.add(new TimeTableModel(0, startTime, endTime, weekDay,
                    "8:20", "10:10", className, proName, "11", "2-13"));

        }
        mTimeTableView.setTimeTable(mList);
    }



    public void typedScreen(View view ){
        Intent intent = new Intent(this, TypedInformation.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }


    }

