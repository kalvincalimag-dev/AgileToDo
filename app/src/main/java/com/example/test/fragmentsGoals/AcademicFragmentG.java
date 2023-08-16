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

public class AcademicFragmentG extends Fragment  {

    String[]  academicGoals = new String[10];
    RelativeLayout relativeLayoutAG;

    FloatingActionButton submitAcademicGoal;
    RadioButton displayAcademicGoal, displayAcademicGoal2, displayAcademicGoal3 ;
    EditText editAcademicGoal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_academic_g, container, false);

        relativeLayoutAG = view.findViewById(R.id.relativeLayoutAG);                            // to be used to add new view/button
        editAcademicGoal = view.findViewById(R.id.editAcademicGoal);
        submitAcademicGoal = view.findViewById(R.id.submitAcademicGoal);
        displayAcademicGoal = view.findViewById(R.id.displayAcademicGoal);
        displayAcademicGoal2 = view.findViewById(R.id.displayAcademicGoal2);
        displayAcademicGoal3 = view.findViewById(R.id.displayAcademicGoal3);


//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayAcademicGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicGoal.isChecked()){
                    displayAcademicGoal.setPaintFlags(displayAcademicGoal.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayAcademicGoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicGoal2.isChecked()){
                    displayAcademicGoal2.setPaintFlags(displayAcademicGoal2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayAcademicGoal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicGoal3.isChecked()){
                    displayAcademicGoal3.setPaintFlags(displayAcademicGoal3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________

        submitAcademicGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    academicGoals[i] = editAcademicGoal.getText().toString();
                    displayAcademicGoal.setText(academicGoals[i]);
                    //displayFinancialGoal.setText(financialGoalOne);
                }
            }
        });
        return view;
    }
}