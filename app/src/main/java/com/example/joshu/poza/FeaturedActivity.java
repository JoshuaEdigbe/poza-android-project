package com.example.joshu.poza;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.internal.BottomNavigationMenu;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by joshu on 7/9/2017.
 */

public class FeaturedActivity extends AppCompatActivity{
    private static final String TAG = "FeaturedActivity";

    BottomNavigationMenu mBottomBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void openNewFiltersPage(){
        Intent newFiltersPage = new Intent(FeaturedActivity.this, MainActivity.class);
        startActivity(newFiltersPage);
    }
}
