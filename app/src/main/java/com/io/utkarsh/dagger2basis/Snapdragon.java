package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

import javax.inject.Inject;

public class Snapdragon implements Processor{

    int clockSpeed;

     public Snapdragon(int clockSpeed) {
         this.clockSpeed = clockSpeed;
        Log.e(TAG, "Snapdragon: " );
    }

    @Override
    public void start() {
        Log.e(TAG, "start: snapdragon");
    }
}
