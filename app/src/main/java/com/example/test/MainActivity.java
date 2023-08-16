package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//DIVIDER FOR CALENDAR BUTTON --------------------------------------------------------------------------------------------------------------------------------

        Button btnCalendar = findViewById(R.id.btnCalendar);
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

        Intent incomingIntent = getIntent();
        String newDate = incomingIntent.getStringExtra("newdate");
        btnCalendar.setText(date);

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

//DIVIDER FOR INFO BUTTON --------------------------------------------------------------------------------------------------------------------------------

        ImageButton btnAboutUs = findViewById(R.id.btnAboutUs);

        btnAboutUs.setOnClickListener(new View.OnClickListener() {           //ASSIGNS MYGOALFUNCTION TO BE EXECUTED WHEN MYGOALBUTTON IS CLICKED
            @Override
            public void onClick(View view) {
                aboutUs();
            }
        });
//DIVIDER FOR HOME BUTTONS --------------------------------------------------------------------------------------------------------------------------------

        Button MyGoalsButton = findViewById(R.id.btnMyGoals);                   //SETTING MYGOALS BUTTON FOR USAGE
        Button MyTasksButton = findViewById(R.id.btnMyTasks);                   //SETTING MYTASKS BUTTON FOR USAGE
        Button MyHabitsButton = findViewById(R.id.btnMyHabits);                 //SETTING MYHABITS BUTTON FOR USAGE


        MyGoalsButton.setOnClickListener(new View.OnClickListener() {           //ASSIGNS MYGOALFUNCTION TO BE EXECUTED WHEN MYGOALBUTTON IS CLICKED
            @Override
            public void onClick(View view) {
                MyGoals();
            }
        });
        MyTasksButton.setOnClickListener(new View.OnClickListener() {           //ASSIGNS MYTASKSFUNCTION TO BE EXECUTED WHEN MYTASKSBUTTON IS CLICKED
            @Override
            public void onClick(View view) {
                MyTasks();
            }
        });
        MyHabitsButton.setOnClickListener(new View.OnClickListener() {           //ASSIGNS MYHABITSFUNCTION TO BE EXECUTED WHEN MYHABITSBUTTON IS CLICKED
            @Override
            public void onClick(View view) {
                MyHabits();
            }
        });
//DIVIDER FOR HOME BUTTONS --------------------------------------------------------------------------------------------------------------------------------

    }

    private void MyGoals() {
        Intent intent = new Intent(this, SubActMyGoals.class);      //CREATION OF MYGOALS FUNCTION (OPEN NEW ACTIVITY)
        startActivity(intent);
    }

    private void MyTasks() {
        Intent intent = new Intent(this, SubActMyTasks.class);      //CREATION OF MYTASKS FUNCTION (OPEN NEW ACTIVITY)
        startActivity(intent);
    }

    private void MyHabits() {
        Intent intent = new Intent(this, SubActMyHabits.class);     //CREATION OF MYHABITS FUNCTION (OPEN NEW ACTIVITY)
        startActivity(intent);
    }

    private void aboutUs(){
        Intent intent = new Intent(this, aboutUs.class);      //CREATION OF MYGOALS FUNCTION (OPEN NEW ACTIVITY)
        startActivity(intent);
    }


}
