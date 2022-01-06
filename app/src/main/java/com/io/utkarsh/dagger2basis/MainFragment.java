

package com.io.utkarsh.dagger2basis;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.io.utkarsh.dagger2basis.component.ActivityComponent;
import com.io.utkarsh.dagger2basis.component.ApplicationComponent;
import com.io.utkarsh.dagger2basis.component.DaggerFragmentComponent;
import com.io.utkarsh.dagger2basis.component.FragmentComponent;

public class MainFragment extends Fragment {

   private View view;
   FragmentComponent fragmentComponent;
   Processor processor1,processor2;
   Battery battery1,battery2;
   Camera camera1, camera2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentComponent = DaggerFragmentComponent.builder()
                .setClockeSpeed(20)
                .setCore(30)
                .build();
        processor1 = fragmentComponent.getProcessor();
        processor2 = fragmentComponent.getProcessor();
        ActivityComponent activityComponent = ((MainActivity)getActivity()).getComponent();
        battery1 = activityComponent.getBattery();
        battery2 = activityComponent.getBattery();

        ApplicationComponent applicationComponent = ((Application)getActivity().getApplicationContext() ).getApplication();
        camera1 = applicationComponent.getCamera();
        camera2 = applicationComponent.getCamera();
        view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}