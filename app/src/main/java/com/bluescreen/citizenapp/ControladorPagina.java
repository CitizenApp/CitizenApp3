package com.bluescreen.citizenapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ControladorPagina extends FragmentPagerAdapter {

    int ntabs;

    public ControladorPagina(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.ntabs = ntabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
               AgendaFragment agendaFragment=new AgendaFragment();
               return  agendaFragment;
            case 1:
                DocumentosFragment documentosFragment=new DocumentosFragment();
                return  documentosFragment;
            case 2:
                return new DocumentosFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return ntabs;
    }
}
