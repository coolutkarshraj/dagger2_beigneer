package com.io.utkarsh.dagger2basis.module;

import com.io.utkarsh.dagger2basis.Processor;
import com.io.utkarsh.dagger2basis.Snapdragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapDragonModule {
     int clockSpeed;

    public SnapDragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
     Processor getProcessor(){
        return new Snapdragon (clockSpeed);
    }
}
