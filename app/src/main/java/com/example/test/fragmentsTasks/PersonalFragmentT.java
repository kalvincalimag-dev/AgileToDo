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

public class PersonalFragmentT extends Fragment  {

    String[] personalTasks = new String[10];
    RelativeLayout relativeLayoutPT;

    FloatingActionButton submitPersonalTask;
    RadioButton displayPersonalTask,displayPersonalTask2,displayPersonalTask3 ;
    EditText editPersonalTask;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal_t, container, false);

        relativeLayoutPT = view.findViewById(R.id.relativeLayoutPT);		// to be used to add new view/button
        editPersonalTask = view.findViewById(R.id.editPersonalTask);
        submitPersonalTask = view.findViewById(R.id.submitPersonalTask);
        displayPersonalTask = view.findViewById(R.id.displayPersonalTask);
        displayPersonalTask2 = view.findViewById(R.id.displayPersonalTask2);
        displayPersonalTask3 = view.findViewById(R.id.displayPersonalTask3);

//SETTING STRIKE THROUGH TEXT UPON RADIOBUTTON CLICK___________________________________________________________________________________________________

        displayPersonalTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalTask.isChecked()){
                    displayPersonalTask.setPaintFlags(displayPersonalTask.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayPersonalTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalTask2.isChecked()){
                    displayPersonalTask2.setPaintFlags(displayPersonalTask2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        displayPersonalTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displayPersonalTask3.isChecked()){
                    displayPersonalTask3.setPaintFlags(displayPersonalTask3.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

//SETTING SUBMIT FAB FUNCTIONALITY___________________________________________________________________________________________________________________

        submitPersonalTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<10;i++) {
                    personalTasks[i] = editPersonalTask.getText().toString();
                    displayPersonalTask.setText(personalTasks[i]);
                }
            }
        });
        return view;
    }
}
