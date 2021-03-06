package com.katiejoy.mediready;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DateActivity extends AppCompatActivity {

    //SQLiteDatabase eventsdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        Button button;
        button = (Button) findViewById(R.id.goHomeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Intent intent = getIntent();

        int month = intent.getIntExtra("month", 0);
        int day = intent.getIntExtra("day", 0);
        int year = intent.getIntExtra("year", 0);

        TextView dateText = (TextView)findViewById(R.id.dateText);
        dateText.setText("Date: "+ (month+1) + "/" + day + "/" + year);

        /*
        try {
            eventsdb = this.openOrCreateDatabase("EVENTSDB", MODE_PRIVATE, null);
            eventsdb.execSQL("CREATE TABLE IF NOT EXISTS EVENTS (key INT, month INT, day INT, year INT, title VARCHAR)");

        } catch (Exception e) {
            Log.i("error", e);
        }
        */
    }
}

