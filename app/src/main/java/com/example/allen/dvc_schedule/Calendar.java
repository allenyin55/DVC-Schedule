package com.example.allen.dvc_schedule;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ScrollView;

public class Calendar extends Activity {
    private TimeTableView mTimaTableView;
    private List<TimeTableModel> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        mList = new ArrayList<TimeTableModel>();
        mTimaTableView = (TimeTableView) findViewById(R.id.main_timetable_ly);
        addList();
        mTimaTableView.setTimeTable(mList);

            }
    private void addList() {
        mList.add(new TimeTableModel(0, 3, 4, 1, "8:20", "10:10", "PHYS",
                "Huet", "Physical Science", "2-13"));
        mList.add(new TimeTableModel(0, 6, 7, 1, "8:20", "10:10", "MATH",
                "Liz", "Liberal Arts", "2-13"));
        mList.add(new TimeTableModel(0, 8, 9, 1, "8:20", "10:10", "CS",
                "Ms.P", "3", "2-13"));
        mList.add(new TimeTableModel(0, 6, 7, 2, "8:20", "10:10", "CHEM",
                "George", "4", "2-13"));
        mList.add(new TimeTableModel(0, 8, 9, 2, "8:20", "10:10", "ENGL",
                "Dr.Willis", "5", "2-13"));
        mList.add(new TimeTableModel(0, 3, 4, 3, "8:20", "10:10", "PHYS",
                "Huet", "6", "2-13"));
        mList.add(new TimeTableModel(0, 6, 7, 3, "8:20", "10:10", "CHEM",
                "George", "7", "2-13"));
        mList.add(new TimeTableModel(0, 3, 5, 4, "8:20", "10:10", "CS",
                "Ms.P", "8", "2-13"));
        mList.add(new TimeTableModel(0, 8, 9, 4, "8:20", "10:10", "MATH",
                "Liz", "9", "2-13"));
        mList.add(new TimeTableModel(0, 3, 5, 5, "8:20", "10:10", "CS",
                "Ms.P", "10", "2-13"));
        mList.add(new TimeTableModel(0, 6, 8, 5, "8:20", "10:10", "ENGL",
                "Dr.Willis", "11", "2-13"));
    }


}
