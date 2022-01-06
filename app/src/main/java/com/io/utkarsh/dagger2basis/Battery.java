package com.io.utkarsh.dagger2basis;

import javax.inject.Inject;

public class Battery {


    /*
    * if we have multiple constructor in class then
    * we can only ise @inject with only one customer
    * */
    @Inject public Battery() {
    }
}
