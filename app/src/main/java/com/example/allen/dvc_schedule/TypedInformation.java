package com.example.allen.dvc_schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class TypedInformation extends AppCompatActivity {

    public EditText cName;
    public EditText sTime;
    public EditText eTime;
    public EditText pName;
    public EditText wTime;
    public String className;
    public String proName;
    public int startTime;
    public int endedTime;
    public int weekTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typed_information);

        cName = (EditText) findViewById(R.id.classInput);
        sTime = (EditText) findViewById(R.id.timeInput);
        eTime = (EditText) findViewById(R.id.endTime);
        pName = (EditText) findViewById(R.id.proInput);
        wTime = (EditText) findViewById(R.id.dayInput);
    }


    public void classInput(View view) {
        className = cName.getText().toString();
    }

    public void timeInput(View view) {
        String timeString = sTime.getText().toString();
        startTime = Integer.parseInt(timeString);
    }

    public void endtimeInput(View view) {
        String endTimeString = eTime.getText().toString();
        endedTime = Integer.parseInt(endTimeString);
    }

    public void proInput(View view) {
        proName = pName.getText().toString();
    }

    public void dayInput(View view) {
        String dayTimeString = wTime.getText().toString();
        weekTime = Integer.parseInt(dayTimeString);
    }




    public void AddtoTable(View view){
        Intent i = new Intent (this, Calendar.class);

        Bundle b = new Bundle();

        b.putString("className",className);
        b.putInt("startTime", startTime);
        b.putInt("endTime", endedTime);
        b.putInt("weekDay", weekTime);
        b.putString("proName", proName);

        i.putExtras(b);
        startActivity(i);


    }





}
