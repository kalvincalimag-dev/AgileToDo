package com.example.test;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);
        CalendarView calendarView = findViewById(R.id.calendarView);

//programmatically resizing calendarlayout________________________________________________________________________________________________
        float scalingFactor = 1.0f;
        calendarView.setScaleX(scalingFactor);
        calendarView.setScaleY(scalingFactor);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                String newdate = (i1+1) + "/" + i2 + "/" +i;
                Log.d(TAG, "onSelectedDayChange: mm/dd/yyyy" + newdate);

                Intent intent = new Intent (CalendarActivity.this, MainActivity.class);
                intent.putExtra("date", newdate);
                startActivity(intent);
            }
        });
    }
}
