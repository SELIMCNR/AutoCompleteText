package com.cinar.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    AutoCompleteTextView autoCompleteTextView;

    String CountryName[] = {"England","Turkey","France","Italy","Abd","Chına","Azerbeycan","Germany","Belgium"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        autoCompleteTextView= (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, CountryName);

        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);//start searching from 1 character
        autoCompleteTextView.setAdapter(adapter);   //set the adapter for displaying country name list

    }


}