package com.io.utkarsh.dagger2basis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.io.utkarsh.dagger2basis.component.ActivityComponent;
import com.io.utkarsh.dagger2basis.component.ApplicationComponent;
import com.io.utkarsh.dagger2basis.component.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    ActivityComponent component;
    Camera camera1,camera2;
    Battery battery1,battery2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new MainFragment());
        component = DaggerActivityComponent.builder().build();
        ApplicationComponent applicationComponent  = ((Application)getApplicationContext()).getApplication();
        ActivityComponent activityComponent = ((MainActivity)this).getComponent();
        camera1 = applicationComponent.getCamera();
        camera2 = applicationComponent.getCamera();
        battery1 = activityComponent.getBattery();
        battery2 = activityComponent.getBattery();

    }

    public void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }

    public ActivityComponent getComponent() {
        return component;
    }
}