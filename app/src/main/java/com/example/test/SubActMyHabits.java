package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class SubActMyHabits extends AppCompatActivity {

    ImageButton btnSaveHabits;
    TabLayout tabLayout;                                                             //SETTING OF PARAMETER TABLAYOUT FOR USAGE
    ViewPager2 viewPager2;                                                          //SETTING OF PARAMETER VIEWPAGER2 FOR USAGE
    ViewPagerAdapterH myViewPagerAdapterH;                                          //SETTING OF PARAMETER MYVIEWADAPTER FOR USAGE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_my_habits);

        btnSaveHabits = findViewById(R.id.btnSaveHabits);
        tabLayout = findViewById(R.id.TabPAFLayoutH);                                 //ASSIGNING OF ID TABLAYOUTH TO TABLAYOUT PARAMETER
        viewPager2 =findViewById(R.id.viewPagerH);                                    //ASSIGNING OF ID VIEWPAGERH TO VIEWPAGER PARAMETER
        myViewPagerAdapterH = new ViewPagerAdapterH(this);               //ASSIGNING OF ID VIEWPAGERADAPTERH TO VIEWPAGERADAPTER PARAMETER
        viewPager2.setAdapter(myViewPagerAdapterH);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {    //CREATION OF TABLAYOUT FUNCTIONS
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });

//BACKBUTTON FUNCTIONS DIVIDER_______________________________________________________________________________________________________________________________

        ImageButton backHomeButtonH = findViewById(R.id.btnBackHomeH);          //SETTING BACK BUTTON FOR USAGE

        backHomeButtonH.setOnClickListener(new View.OnClickListener() {         //ASSIGNING BACKHOME FUNCTION TO BE EXECUTED WHEN BACKHOME BUTTON IS CLICKED
            @Override
            public void onClick(View view) { backHome();}
        });

//DIVIDER FOR SAVE BUTTON  --------------------------------------------------------------------------------------------------------------------------------

        btnSaveHabits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubActMyHabits.this, "PAF Habits Saved", Toast.LENGTH_SHORT).show();
            }
        });

//BACKBUTTON FUNCTIONS DIVIDER_______________________________________________________________________________________________________________________________

    }


    private void backHome(){
        Intent intent = new Intent(this, MainActivity.class);      //CREATION OF BACKHOME FUNCTION (GO BACK TO HOMEPAGE)
        startActivity(intent);
    }
}