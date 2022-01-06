package com.io.utkarsh.dagger2basis.module;

import com.io.utkarsh.dagger2basis.Camera;
import com.io.utkarsh.dagger2basis.scopes.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class CameraModule {

    @ApplicationScope
    @Provides
    static Camera getCamera( @Named("megapixel") int megapixel){
        return new Camera(megapixel);
    }
}
