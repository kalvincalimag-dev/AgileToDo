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

public class FinancialFragmentH extends Fragment  {

    String[]  financialHabits = new String[10];
    RelativeLayout relativeLayoutFH;

    FloatingActionButton submitFinancialHabit;
    RadioButton displayFinancialHabit,displayFinancialHabit2,displayFinancialHabit3 ;
    EditText editFinancialHabit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_financial_h, container, false);

        relativeLayoutFH = view.findViewById(R.id.relativeLayoutFH);                            // to be used to add new view/button
        editFinancialHabit = view.findViewById(R.id.editFinancialHabit);
        submitFinancialHabit = view.findViewById(R.id.submitFinancialHabit);
        displayFinancialHabit = view.findViewById(R.id.displayFinancialHabit);
        displayFinancialHabit2 = view.findViewById(R.id.displayFinancialHabit2);
        displayFinancialHabit3 = view.findViewById(R.id.displayFinancialHabit3);

//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayFinancialHabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialHabit.isChecked()){
                    displayFinancialHabit.setPaintFlags(displayFinancialHabit.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayFinancialHabit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialHabit2.isChecked()){
                    displayFinancialHabit2.setPaintFlags(displayFinancialHabit2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayFinancialHabit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialHabit3.isChecked()){
                    displayFinancialHabit3.setPaintFlags(displayFinancialHabit3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________


        submitFinancialHabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    financialHabits[i] = editFinancialHabit.getText().toString();
                    displayFinancialHabit.setText(financialHabits[i]);
                }
            }
        });
        return view;
    }
}
