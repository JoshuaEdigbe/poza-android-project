package com.example.joshu.poza;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.featured);


    }

    private void setupBottomNavigationView(){

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavToolbar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.ic_featured_nav:
                        Toast.makeText(MainActivity.this, "Featured Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.ic_filter_nav:
                        Toast.makeText(MainActivity.this, "Filters Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.ic_stickers_nav:
                        Toast.makeText(MainActivity.this, "Sticker Clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

    public void openNewFiltersPage(){
        Intent newFiltersPage = new Intent(MainActivity.this, FeaturedActivity.class);
        startActivity(newFiltersPage);
    }

}
