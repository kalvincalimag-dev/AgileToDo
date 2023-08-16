

package com.example.test;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.test.fragmentsHabits.AcademicFragmentH;
import com.example.test.fragmentsHabits.FinancialFragmentH;
import com.example.test.fragmentsHabits.PersonalFragmentH;

public class ViewPagerAdapterH extends FragmentStateAdapter {
    public ViewPagerAdapterH(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PersonalFragmentH();
            case 1:
                return new AcademicFragmentH();
            case 2:
                return new FinancialFragmentH();
            default:
                return new PersonalFragmentH();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
	