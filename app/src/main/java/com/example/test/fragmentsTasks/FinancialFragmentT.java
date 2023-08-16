package com.example.test.fragmentsTasks;

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

public class FinancialFragmentT extends Fragment  {

    String[] financialTasks = new String[10];
    RelativeLayout relativeLayoutFT;

    FloatingActionButton submitFinancialTask;
    RadioButton displayFinancialTask,displayFinancialTask2,displayFinancialTask3;
    EditText editFinancialTask;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_financial_t, container, false);

        relativeLayoutFT = view.findViewById(R.id.relativeLayoutFT);	    	// to be used to add new view/button
        editFinancialTask = view.findViewById(R.id.editFinancialTask);
        submitFinancialTask = view.findViewById(R.id.submitFinancialTask);
        displayFinancialTask = view.findViewById(R.id.displayFinancialTask);
        displayFinancialTask2 = view.findViewById(R.id.displayFinancialTask2);
        displayFinancialTask3 = view.findViewById(R.id.displayFinancialTask3);

//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayFinancialTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialTask.isChecked()){
                    displayFinancialTask.setPaintFlags(displayFinancialTask.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayFinancialTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialTask2.isChecked()){
                    displayFinancialTask2.setPaintFlags(displayFinancialTask2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayFinancialTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayFinancialTask3.isChecked()){
                    displayFinancialTask3.setPaintFlags(displayFinancialTask3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________


        submitFinancialTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    financialTasks[i] = editFinancialTask.getText().toString();
                    displayFinancialTask.setText(financialTasks[i]);
                }
            }
        });
        return view;
    }
}
