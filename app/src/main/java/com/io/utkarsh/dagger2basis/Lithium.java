package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

/*
 * We can't own this class se we can't annotate it with @inject
 * */

public class Lithium {

    public Lithium() {
        Log.e(TAG, "Lithium: " );
    }

    public void done(){
        Log.e(TAG, "done: " );
    }
}
