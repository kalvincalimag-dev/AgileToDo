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

public class FinancialFragmentG extends Fragment  {

    String[] financialGoals = new String[10];
    RelativeLayout relativeLayoutFG;

    FloatingActionButton submitFinancialGoal;
    RadioButton displayFinancialGoal, displayFinancialGoal2, displayFinancialGoal3;
    EditText editFinancialGoal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_financial_g, container, false);

        relativeLayoutFG = view.findViewById(R.id.relativeLayoutFG);                                    // to be used to add new view/button
        editFinancialGoal = view.findViewById(R.id.editFinancialGoal);
        submitFinancialGoal = view.findViewById(R.id.submitFinancialGoal);
        displayFinancialGoal = view.findViewById(R.id.displayFinancialGoal);
        displayFinancialGoal2 = view.findViewById(R.id.displayFinancialGoal2);
        displayFinancialGoal3 = view.findViewById(R.id.displayFinancialGoal3);

//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayFinancialGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialGoal.isChecked()){
                    displayFinancialGoal.setPaintFlags(displayFinancialGoal.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayFinancialGoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialGoal2.isChecked()){
                    displayFinancialGoal2.setPaintFlags(displayFinancialGoal2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayFinancialGoal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialGoal3.isChecked()){
                    displayFinancialGoal3.setPaintFlags(displayFinancialGoal3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        submitFinancialGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    financialGoals[i] = editFinancialGoal.getText().toString();
                    displayFinancialGoal.setText(financialGoals[i]);
                    //displayFinancialGoal.setText(financialGoalOne);
                }
            }
        });
        return view;
    }

}
