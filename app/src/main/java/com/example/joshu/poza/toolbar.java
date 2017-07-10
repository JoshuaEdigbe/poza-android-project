package com.example.joshu.poza;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by joshu on 7/10/2017.
 */

public class toolbar extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar mToolBar = (Toolbar) findViewById(R.id.toolbar);
        mToolBar.setTitle("New Filters");


    }


}