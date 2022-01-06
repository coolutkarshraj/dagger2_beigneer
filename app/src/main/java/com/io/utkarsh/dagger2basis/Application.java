package com.io.utkarsh.dagger2basis;

import com.io.utkarsh.dagger2basis.component.ApplicationComponent;
import com.io.utkarsh.dagger2basis.component.DaggerApplicationComponent;


//we will define component in we want Componect create object once then go for application class
public class Application extends android.app.Application {

    ApplicationComponent applicationComponent;
    Camera camera1,camera2;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .setMegaPixel(90)
                .build();

        camera1 = applicationComponent.getCamera();
        camera2 = applicationComponent.getCamera();


    }

    public ApplicationComponent getApplication() {
        return applicationComponent;
    }
}
