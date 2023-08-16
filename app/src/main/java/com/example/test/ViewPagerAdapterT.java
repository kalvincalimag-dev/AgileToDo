package com.example.test;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.test.fragmentsTasks.AcademicFragmentT;
import com.example.test.fragmentsTasks.FinancialFragmentT;
import com.example.test.fragmentsTasks.PersonalFragmentT;

public class ViewPagerAdapterT extends FragmentStateAdapter {
    public ViewPagerAdapterT(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PersonalFragmentT();
            case 1:
                return new AcademicFragmentT();
            case 2:
                return new FinancialFragmentT();
            default:
                return new PersonalFragmentT();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
