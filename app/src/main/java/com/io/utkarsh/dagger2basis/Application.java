package com.io.utkarsh.dagger2basis;

import com.io.utkarsh.dagger2basis.component.DaggerMobileComponent;
import com.io.utkarsh.dagger2basis.component.MobileComponent;


//we will define component in we want Componect create object once then go for application class
public class Application extends android.app.Application {
    MobileComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMobileComponent.factory().create(10,15,3);

    }
    public MobileComponent getComponent(){
        return component;
    }


}
