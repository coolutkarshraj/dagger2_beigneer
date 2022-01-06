package com.io.utkarsh.dagger2basis;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    @Inject
    public Mobile(Battery battery,Processor processor){

    }

    public void run (){
        Log.e("Mobile Object","it is running");
    }
}
