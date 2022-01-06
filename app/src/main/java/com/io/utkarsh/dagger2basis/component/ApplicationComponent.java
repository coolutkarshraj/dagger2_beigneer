package com.io.utkarsh.dagger2basis.component;

import com.io.utkarsh.dagger2basis.Camera;
import com.io.utkarsh.dagger2basis.module.CameraModule;
import com.io.utkarsh.dagger2basis.scopes.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


@ApplicationScope
@Component(modules = {CameraModule.class})
public interface ApplicationComponent {

    Camera getCamera();
    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setMegaPixel(@Named("megapixel")int megaPixel);

        ApplicationComponent build();
    }
}
