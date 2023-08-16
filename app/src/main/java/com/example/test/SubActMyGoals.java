package com.example.test;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;
import android.widget.Toast;

import androidx.viewpager2.widget.ViewPager2;

public class SubActMyGoals extends AppCompatActivity {

    ImageButton btnSaveGoals;
    TabLayout tabLayout;                                                            //SETTING OF PARAMETER TABLAYOUT FOR USAGE
    ViewPager2 viewPager2;                                                          //SETTING OF PARAMETER VIEWPAGER2 FOR USAGE
    ViewPagerAdapterG myViewPagerAdapterG;                                          //SETTING OF PARAMETER MYVIEWADAPTER FOR USAGE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_my_goals);

        btnSaveGoals = findViewById(R.id.btnSaveGoals);
        tabLayout = findViewById(R.id.TabPAFLayoutG);                                 //ASSIGNING OF ID TABLAYOUTG TO TABLAYOUT PARAMETER
        viewPager2 =findViewById(R.id.viewPagerG);                                    //ASSIGNING OF ID VIEWPAGERG TO VIEWPAGER PARAMETER
        myViewPagerAdapterG = new ViewPagerAdapterG(this);               //ASSIGNING OF ID VIEWPAGERADAPTERG TO VIEWPAGERADAPTER PARAMETER
        viewPager2.setAdapter(myViewPagerAdapterG);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {     //CREATION OF TABLAYOUT FUNCTIONS
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

        ImageButton backHomeButtonG = findViewById(R.id.btnBackHomeG);              //SETTING BACK BUTTON FOR USAGE

        backHomeButtonG.setOnClickListener(new View.OnClickListener() {             //ASSIGNING BACKHOME FUNCTION TO BE EXECUTED WHEN BACKHOME BUTTON IS CLICKED
            @Override
            public void onClick(View view) { backHome(); }
        });

//DIVIDER FOR SAVE BUTTON  --------------------------------------------------------------------------------------------------------------------------------

        btnSaveGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubActMyGoals.this, "PAF Goals Saved", Toast.LENGTH_SHORT).show();
            }
        });

//BACKBUTTON FUNCTIONS DIVIDER_______________________________________________________________________________________________________________________________


    }


    private void backHome(){
        Intent intent = new Intent(this, MainActivity.class);      //CREATION OF BACKHOME FUNCTION (GO BACK TO HOMEPAGE)
        startActivity(intent);
    }



}