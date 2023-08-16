package com.example.test.fragmentsHabits;

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

public class AcademicFragmentH extends Fragment  {

    String[]  academicHabits = new String[10];
    RelativeLayout relativeLayoutAH;

    FloatingActionButton submitAcademicHabit;
    RadioButton displayAcademicHabit,displayAcademicHabit2,displayAcademicHabit3;
    EditText editAcademicHabit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_academic_h, container, false);

        relativeLayoutAH = view.findViewById(R.id.relativeLayoutAH);                            // to be used to add new view/button
        editAcademicHabit = view.findViewById(R.id.editAcademicHabit);
        submitAcademicHabit = view.findViewById(R.id.submitAcademicHabit);
        displayAcademicHabit = view.findViewById(R.id.displayAcademicHabit);
        displayAcademicHabit2 = view.findViewById(R.id.displayAcademicHabit2);
        displayAcademicHabit3 = view.findViewById(R.id.displayAcademicHabit3);


//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayAcademicHabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicHabit.isChecked()){
                    displayAcademicHabit.setPaintFlags(displayAcademicHabit.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayAcademicHabit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicHabit2.isChecked()){
                    displayAcademicHabit2.setPaintFlags(displayAcademicHabit2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayAcademicHabit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicHabit3.isChecked()){
                    displayAcademicHabit3.setPaintFlags(displayAcademicHabit3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________

        submitAcademicHabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    academicHabits[i] = editAcademicHabit.getText().toString();
                    displayAcademicHabit.setText(academicHabits[i]);
                }
            }
        });
        return view;
    }
}
