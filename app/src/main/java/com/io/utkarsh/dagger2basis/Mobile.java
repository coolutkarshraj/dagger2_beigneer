package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {


    private Battery battery;
    private final Processor processor;

    @Inject
    public Mobile(Battery battery, Processor processor) {
        this.processor = processor;
        Log.e(TAG, "Mobile: Constructor");
        this.battery = battery;

    }

    public void run() {
        Log.e("Mobile Object", "it is running");
    }

//    /*
//     *if we need to pass the instance of the same
//     * class to another class after constructor gots created then we will go
//     * Method Injection
//     * if we use all injection then flow is like constructor,Field
//     * ,Method injection
//     * */
//    @Inject
//    public void connectCharger(Charger charger) {
//        charger.setCharger(this);
//    }
}
