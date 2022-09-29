package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MyGoalsButton = findViewById(R.id.MyGoalsButton);

        MyGoalsButton.setOnClickListener(new View.OnClickListener() {
            //CODE THAT SI EXECUTED WHEN USER PRESSES BUTTON
            @Override
            public void onClick(View view) {
                MyGoals(); // FUNCTION FOR MYGOALSBUTTON
            }
        });


    }
    private void MyGoals(){
        //CODE THAT SWAPS OVER TO ACTIVITY TWO
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}