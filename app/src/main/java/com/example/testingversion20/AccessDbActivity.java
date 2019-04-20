package com.example.testingversion20;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AccessDbActivity extends AppCompatActivity {

    public static MyAppDatabase myAppDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        myAppDatabase = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class, "QandaDb")
                .allowMainThreadQueries()
                .build();


    }


    public void launchAddQanda(View view) {

        Intent myIntent = new Intent(getBaseContext(), AddQandaActivity.class);
        startActivity(myIntent);


    }

    public void launchViewQanda(View view) {
        Intent myIntent = new Intent(getBaseContext(), ReadQandaActivity.class);
        startActivity(myIntent);

    }

    public void launchDeleteQanda(View view) {
        Intent myIntent = new Intent(getBaseContext(), DeleteQandaActivity.class);
        startActivity(myIntent);

    }

    public void launchUpdateQanda(View view) {
        Intent myIntent = new Intent(getBaseContext(), UpdateQandaActivity.class);
        startActivity(myIntent);

    }

}
