package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

import javax.inject.Inject;

public class Mediatek implements Processor {
    @Inject
    public Mediatek() {
        Log.e(TAG, "Mediatek: " );
    }

    @Override
    public void start() {
        Log.e(TAG, "start: snapdragon");
    }
}
