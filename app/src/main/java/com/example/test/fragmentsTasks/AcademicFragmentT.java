
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

public class AcademicFragmentT extends Fragment  {

    String[] academicTasks = new String[10];
    RelativeLayout relativeLayoutAT;

    FloatingActionButton submitAcademicTask;
    RadioButton displayAcademicTask,displayAcademicTask2,displayAcademicTask3;
    EditText editAcademicTask;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_academic_t, container, false);

        relativeLayoutAT = view.findViewById(R.id.relativeLayoutAT);	            	// to be used to add new view/button
        editAcademicTask = view.findViewById(R.id.editAcademicTask);
        submitAcademicTask = view.findViewById(R.id.submitAcademicTask);
        displayAcademicTask = view.findViewById(R.id.displayAcademicTask);
        displayAcademicTask2 = view.findViewById(R.id.displayAcademicTask2);
        displayAcademicTask3 = view.findViewById(R.id.displayAcademicTask3);

//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayAcademicTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicTask.isChecked()){
                    displayAcademicTask.setPaintFlags(displayAcademicTask.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayAcademicTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicTask2.isChecked()){
                    displayAcademicTask2.setPaintFlags(displayAcademicTask2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayAcademicTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayAcademicTask3.isChecked()){
                    displayAcademicTask3.setPaintFlags(displayAcademicTask3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________


        submitAcademicTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    academicTasks[i] = editAcademicTask.getText().toString();
                    displayAcademicTask.setText(academicTasks[i]);
                }
            }
        });
        return view;
    }
}




