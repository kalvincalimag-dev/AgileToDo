package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState){
          super.onCreate(savedInstanceState);

          new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
               startActivity(new Intent(splashscreen.this, MainActivity.class));
               finish();
               }
          },2000);

     }
}
