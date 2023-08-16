package com.example.test.fragmentsGoals;

import android.graphics.Paint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.example.test.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PersonalFragmentG extends Fragment  {

    String[] personalGoals = new String[10];
    RelativeLayout relativeLayoutPG;

    FloatingActionButton submitPersonalGoal;
    RadioButton displayPersonalGoal, displayPersonalGoal2, displayPersonalGoal3;
    EditText editPersonalGoal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal_g, container, false);

        relativeLayoutPG = view.findViewById(R.id.relativeLayoutPG);                            // to be used to add new view/button
        editPersonalGoal = view.findViewById(R.id.editPersonalGoal);
        submitPersonalGoal = view.findViewById(R.id.submitPersonalGoal);
        displayPersonalGoal = view.findViewById(R.id.displayPersonalGoal);
        displayPersonalGoal2 = view.findViewById(R.id.displayPersonalGoal2);
        displayPersonalGoal3 = view.findViewById(R.id.displayPersonalGoal3);

//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayPersonalGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalGoal.isChecked()){
                    displayPersonalGoal.setPaintFlags(displayPersonalGoal.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayPersonalGoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalGoal2.isChecked()){
                    displayPersonalGoal2.setPaintFlags(displayPersonalGoal2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayPersonalGoal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalGoal3.isChecked()){
                    displayPersonalGoal3.setPaintFlags(displayPersonalGoal3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________
        submitPersonalGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    personalGoals[i] = editPersonalGoal.getText().toString();
                    displayPersonalGoal.setText(personalGoals[i]);
                    //displayFinancialGoal.setText(financialGoalOne);
                }
            }
        });
        return view;
    }
}
