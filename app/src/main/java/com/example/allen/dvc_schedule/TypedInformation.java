package com.example.allen.dvc_schedule;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
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
    private List<String> mList = new ArrayList<>();
    private final static String TAG = "message";

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

    public void AddtoTable(View view){
        Intent i = new Intent (this, Calendar.class);

        mList.add(0,cName.getText().toString());
        mList.add(1,pName.getText().toString());
        mList.add(2,sTime.getText().toString());
        mList.add(3,eTime.getText().toString());
        mList.add(4, wTime.getText().toString());

        saveArray();

        startActivity(i);
    }
    public boolean saveArray()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor mEdit1 = sp.edit();
        int size = sp.getAll().size();

        for(int i=0;i < mList.size();i++)
        {
            mEdit1.putString("Status_" + i + size, mList.get(i));
        }


        return mEdit1.commit();
    }

}
