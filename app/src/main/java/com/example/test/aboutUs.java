package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class aboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ImageButton backHomeButtonG = findViewById(R.id.btnBackHomeAU);              //SETTING BACK BUTTON FOR USAGE

        backHomeButtonG.setOnClickListener(new View.OnClickListener() {             //ASSIGNING BACKHOME FUNCTION TO BE EXECUTED WHEN BACKHOME BUTTON IS CLICKED
            @Override
            public void onClick(View view) { backHome(); }
        });
    }
    private void backHome(){
        Intent intent = new Intent(this, MainActivity.class);      //CREATION OF BACKHOME FUNCTION (GO BACK TO HOMEPAGE)
        startActivity(intent);
    }

}