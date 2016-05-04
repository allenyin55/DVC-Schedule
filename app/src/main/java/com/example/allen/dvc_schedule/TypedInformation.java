package com.example.allen.dvc_schedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TypedInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typed_information);
    }
    public EditText itemName;
    public EditText itemTime;
    public EditText endTime;
    public EditText proName;
    public EditText dayTime;
    public int startTime;
    public int endedTime;
    public int weekTime;

    public void classInput(View view ){
        itemName = (EditText) findViewById(R.id.classInput);
    }
    public void timeInput(View view ){
        itemTime = (EditText) findViewById(R.id.timeInput);
        String timeString = itemTime.getText().toString();
        startTime = Integer.parseInt(timeString);
    }
    public void endtimeInput(View view ){
        endTime = (EditText) findViewById(R.id.endTime);
        String endTimeString = endTime.getText().toString();
        endedTime = Integer.parseInt(endTimeString);
    }
    public void proInput(View view ){
        proName = (EditText) findViewById(R.id.proInput);
    }

    public void dayInput(View view){
        dayTime = (EditText) findViewById(R.id.dayInput);
        String dayTimeString = dayTime.getText().toString();
        weekTime = Integer.parseInt(dayTimeString);
    }


}
