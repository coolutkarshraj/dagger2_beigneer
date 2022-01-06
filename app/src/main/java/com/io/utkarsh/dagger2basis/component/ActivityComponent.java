package com.io.utkarsh.dagger2basis.component;

import com.io.utkarsh.dagger2basis.Battery;
import com.io.utkarsh.dagger2basis.module.BatteryModule;
import com.io.utkarsh.dagger2basis.scopes.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = {BatteryModule.class})
public interface ActivityComponent {
    Battery getBattery();
}
