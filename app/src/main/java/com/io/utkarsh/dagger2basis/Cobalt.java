package com.io.utkarsh.dagger2basis;

import android.util.Log;

public class Cobalt {
    /*
     * We can't own this class se we can't annotate it with @inject
     * */
    private static final String TAG = "Tag";

    public Cobalt(){
        Log.e(TAG, "Cobalt: ");
    }
}
