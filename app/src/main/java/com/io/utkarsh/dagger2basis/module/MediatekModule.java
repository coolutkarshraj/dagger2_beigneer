package com.io.utkarsh.dagger2basis.module;

import com.io.utkarsh.dagger2basis.Mediatek;
import com.io.utkarsh.dagger2basis.Processor;
import com.io.utkarsh.dagger2basis.scopes.FragmentScope;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediatekModule {


    //@Binds is (slightly) more compact:
    //@Binds works in interfaces and abstract classes, which are strictly
    // required for Dagger features like @BindsOptionalOf and @ContributesAndroidInjector.
    /*
     * @Binds helps your code stay efficient. @Provides methods can be instance
     *  methods, which require Dagger to instantiate your Module in order to
     * call them. Making your @Provides method static will also accomplish this,
     * but your @Provides method will still compile if you forget the static.
     * @Binds methods will not.*/
    @FragmentScope
    @Binds
    abstract Processor getProcessor(Mediatek mediatek);
}
