package com.io.utkarsh.dagger2basis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.io.utkarsh.dagger2basis.component.DaggerMobileComponent;
import com.io.utkarsh.dagger2basis.component.MobileComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /*
    * Dagger is comonly known as Direct Acyclic Graph
    *here we can't do construction injection because we are not responsible for
    * creating object then here we need the object of mobile object then we
    * need to provision method
    *
    * */



    /*
    * In field injection we cannot make field as a private
    * if we have a class where we cannot do constructor injection
    * then we use field injection
    * exaple like working with any framework like Activity
    * */
    @Inject
    public Mobile mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1st lecture understanding constructor injection
//        MobileComponent component = DaggerMobileComponent.create();
//        Mobile mobile = component.getMobile();
//        mobile.run();


        MobileComponent component = DaggerMobileComponent.create();
        component.inject(this);
        mobile.run();
    }

}