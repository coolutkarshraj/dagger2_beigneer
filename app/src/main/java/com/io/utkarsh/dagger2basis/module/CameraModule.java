package com.io.utkarsh.dagger2basis.module;

import com.io.utkarsh.dagger2basis.Camera;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class CameraModule {

    @Provides
    static Camera getCamera( @Named("megapixel") int megapixel){
        return new Camera(megapixel);
    }
}
