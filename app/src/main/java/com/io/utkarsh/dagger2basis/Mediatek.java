package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/*
* if we are using constructor injection then we can write @singleston
* above the class
*
*@singelton is a scope  and any scope work within a component.
* if we want to create any component calls only once then we need to create
* in Appllication like see Application class
*
*
* */


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
