package com.io.utkarsh.dagger2basis.component;

import com.io.utkarsh.dagger2basis.MainActivity;
import com.io.utkarsh.dagger2basis.Mobile;
import com.io.utkarsh.dagger2basis.module.BatteryModule;

import dagger.Component;


/*
* it is the backbone of dagger
* HOW OBJECT HAS BEEN CREATED
* AND WHAT IS THE DEPENDECIES GRAPH ALL things handle
* */

@Component(modules = BatteryModule.class)
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
}
