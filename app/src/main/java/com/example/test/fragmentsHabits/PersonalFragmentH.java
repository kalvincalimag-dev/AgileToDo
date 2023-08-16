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

public class PersonalFragmentH extends Fragment  {

    String[]  personalHabits = new String[10];
    RelativeLayout relativeLayoutPH;

    FloatingActionButton submitPersonalHabit;
    RadioButton displayPersonalHabit, displayPersonalHabit2, displayPersonalHabit3 ;
    EditText editPersonalHabit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal_h, container, false);

        relativeLayoutPH = view.findViewById(R.id.relativeLayoutPH);
        editPersonalHabit = view.findViewById(R.id.editPersonalHabit);
        submitPersonalHabit = view.findViewById(R.id.submitPersonalHabit);
        displayPersonalHabit = view.findViewById(R.id.displayPersonalHabit);
        displayPersonalHabit2 = view.findViewById(R.id.displayPersonalHabit2);
        displayPersonalHabit3 = view.findViewById(R.id.displayPersonalHabit3);


//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayPersonalHabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalHabit.isChecked()){
                    displayPersonalHabit.setPaintFlags(displayPersonalHabit.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayPersonalHabit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalHabit2.isChecked()){
                    displayPersonalHabit2.setPaintFlags(displayPersonalHabit2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayPersonalHabit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalHabit3.isChecked()){
                    displayPersonalHabit3.setPaintFlags(displayPersonalHabit3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________

        submitPersonalHabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    personalHabits[i] = editPersonalHabit.getText().toString();
                    displayPersonalHabit.setText(personalHabits[i]);
                }
            }
        });
        return view;
    }
}


