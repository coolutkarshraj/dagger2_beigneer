package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

import javax.inject.Inject;

public class Charger {

    @Inject public Charger() {
        Log.e(TAG, "Charger: charger constructor" );

    }

    public void setCharger(Mobile mobile){
        Log.e(TAG, "setCharger: done" );
    }
}
