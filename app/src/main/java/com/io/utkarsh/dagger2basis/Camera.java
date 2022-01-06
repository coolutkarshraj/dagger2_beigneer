package com.io.utkarsh.dagger2basis;

import static android.content.ContentValues.TAG;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.BindsInstance;

public class Camera {
    //This class think coming from outside so we can't do construction injection

    int megaPixel;

    @Inject public Camera(@Named("megapixel") int megaPixel) {
        this.megaPixel = megaPixel;
        Log.e(TAG, "Camera: " );
    }
}
