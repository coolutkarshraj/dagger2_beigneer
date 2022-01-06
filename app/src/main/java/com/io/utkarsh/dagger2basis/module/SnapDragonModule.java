package com.io.utkarsh.dagger2basis.module;

import com.io.utkarsh.dagger2basis.Processor;
import com.io.utkarsh.dagger2basis.Snapdragon;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapDragonModule {
     int clockSpeed;

    @Inject
    public SnapDragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    int getClockSpeed(){
        return clockSpeed;
    }

    @Provides
     Processor getProcessor(Snapdragon snapdragon){
        return snapdragon;
    }
}
