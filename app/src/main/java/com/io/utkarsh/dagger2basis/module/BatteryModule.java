package com.io.utkarsh.dagger2basis.module;


import com.io.utkarsh.dagger2basis.Battery;
import com.io.utkarsh.dagger2basis.Cobalt;
import com.io.utkarsh.dagger2basis.Lithium;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/*
*
* if we use any third part library where we cannot change the constructor or
* change the code of class then we cannot use directly constructor injection
* in this case we need different way toto do injection and in this case we use
*  module annotation and inside module annotaion there are @provides annotation
* which will tell the dagger that how dagger will create the  object of the class
*
* */

@Module
public class BatteryModule {

    @Provides
    static Cobalt getCobalt(){
        return new Cobalt();
    }

    @Provides static Lithium getLithum (){
        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }

    @Singleton
    @Provides
    Battery getBattery(Lithium lithium,Cobalt cobalt){
        return new Battery(cobalt,lithium);
    }
}
