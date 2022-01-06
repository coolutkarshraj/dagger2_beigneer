package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Mediatek implements Processor {
    int clockSpeed;
    int core;
    @Inject
    public Mediatek(@Named("clockSpeed") int clockSpeed, @Named("Core") int core) {
        this.clockSpeed = clockSpeed;
        this.core = core;
        Log.e(TAG, "Mediatek: " );
    }

    @Override
    public void start() {
        Log.e(TAG, "start: snapdragon");
    }
}
