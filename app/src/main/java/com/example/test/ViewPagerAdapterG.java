package com.example.test;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.test.fragmentsGoals.AcademicFragmentG;
import com.example.test.fragmentsGoals.FinancialFragmentG;
import com.example.test.fragmentsGoals.PersonalFragmentG;

public class ViewPagerAdapterG extends FragmentStateAdapter {
    public ViewPagerAdapterG(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PersonalFragmentG();
            case 1:
                return new AcademicFragmentG();
            case 2:
                return new FinancialFragmentG();
            default:
                return new PersonalFragmentG();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
