package com.example.odev2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {
    public TabsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                AddQuestionsFragment addQuestionsFragment = new AddQuestionsFragment() ;
                return addQuestionsFragment;
            case 1:
                ListQuestionFragment listQuestionFragment = new ListQuestionFragment();
                return listQuestionFragment;
            case 2:
                CreateExamFragment createExamFragment = new CreateExamFragment();
                return  createExamFragment;
            case 3:
                ExamSettingsFragment examSettingsFragment = new ExamSettingsFragment();
                return examSettingsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "SORU EKLE";
            case 1:
                return "SORU LİSTELE";
            case 2:
                return  "SINAV OLUŞTUR";
            case 3:
                return  "SINAV AYARLARI";
            default:
                return null;
        }
    }
}
