package com.example.allen.dvc_schedule;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.os.Bundle;
import android.preference.PreferenceManager;
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
    private static TimeTableView mTimeTableView;
    private static List<TimeTableModel> newList;
    private static List<String> mList = new ArrayList<>();
    public static String className, proName;
    public static int startTime, endTime, weekDay;
    private Context context;
    private static boolean check;
    private final static String TAG = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        newList = new ArrayList<TimeTableModel>();
        mTimeTableView = (TimeTableView) findViewById(R.id.main_timetable_ly);

        context = this;
        loadArray(context);
    }


    public static void loadArray(Context mContext)
    {
        SharedPreferences mSharedPreference1 =   PreferenceManager.getDefaultSharedPreferences(mContext);
        check = mSharedPreference1.contains("Status_0");

        if (check) {
            int size = mSharedPreference1.getAll().size();

            Log.i(TAG, "I am gonna take class from the shapre with size of "+String.valueOf(mSharedPreference1.getAll().size()));

            for(int i=0;i<size;i++)
            {
                mList.add(mSharedPreference1.getString("Status_" + i, null));
                Log.i(TAG, "The item being loaded is " + mList.get(i));
            }

            for(int i = 0; i < mSharedPreference1.getAll().size(); i = i+5){
                className = mList.get(0+i);
                proName = mList.get(1+i);
                startTime = Integer.parseInt(mList.get(2 + i));
                endTime = Integer.parseInt(mList.get(3+i));
                weekDay = Integer.parseInt(mList.get(4+i));
                newList.add(new TimeTableModel(0, startTime, endTime, weekDay,
                        "8:20", "10:10", className, proName, "11", "2-13"));
            }
            mTimeTableView.setTimeTable(newList);
        }    }


    public void typedScreen(View view ){
        Intent intent = new Intent(this, TypedInformation.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);
    }


    }

