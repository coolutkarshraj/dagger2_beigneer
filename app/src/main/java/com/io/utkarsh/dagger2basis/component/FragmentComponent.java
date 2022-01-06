package com.io.utkarsh.dagger2basis.component;

import com.io.utkarsh.dagger2basis.Mobile;
import com.io.utkarsh.dagger2basis.Processor;
import com.io.utkarsh.dagger2basis.module.MediatekModule;
import com.io.utkarsh.dagger2basis.scopes.FragmentScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@FragmentScope
@Component(dependencies = {ApplicationComponent.class,ActivityComponent.class}, modules = {MediatekModule.class})
public interface FragmentComponent {

    Processor getProcessor();

    Mobile getMobile();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder setClockeSpeed(@Named("clockSpeed") int clockeSpeed);

        @BindsInstance
        Builder setCore(@Named("Core") int core);

        Builder setApplicomponet(ApplicationComponent component);

        Builder setActivityComponent (ActivityComponent activityComponent);

        FragmentComponent build();


    }

}
