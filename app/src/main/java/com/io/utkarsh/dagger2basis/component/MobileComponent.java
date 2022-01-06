package com.io.utkarsh.dagger2basis.component;

import com.io.utkarsh.dagger2basis.MainActivity;
import com.io.utkarsh.dagger2basis.Mobile;
import com.io.utkarsh.dagger2basis.module.BatteryModule;
import com.io.utkarsh.dagger2basis.module.MediatekModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


/*
 * it is the backbone of dagger
 * HOW OBJECT HAS BEEN CREATED
 * AND WHAT IS THE DEPENDECIES GRAPH ALL things handle
 * */

@Component(modules = {BatteryModule.class, MediatekModule.class})
public interface MobileComponent {


    /*
     * if we define  anymethod in any component then
     * it is known as provision method
     * */
    Mobile getMobile();


    /*
     * For Field injection
     * */
    void inject(MainActivity mainActivity);

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder setClockeSpeed(@Named("clockSpeed") int clockeSpeed);
//
//        @BindsInstance
//         Builder setCore(@Named("Core") int core);
//
//        MobileComponent build();
//
//    }

    // by using factory we put restriction on the data that i sent from
    // activity but in case of buider it is not necessary
    @Component.Factory
    interface factory {

        MobileComponent create(@BindsInstance @Named("clockSpeed")
                                       int clockeSpeed
                , @BindsInstance @Named("Core") int core,
                               @BindsInstance @Named("megapixel") int megapixel);
    }
}
