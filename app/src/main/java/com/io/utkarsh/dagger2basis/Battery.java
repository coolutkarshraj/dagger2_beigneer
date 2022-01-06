package com.io.utkarsh.dagger2basis;

import javax.inject.Inject;

public class Battery {

    /*
    * We can't own this class se we can't annotate it with @inject
    * */

    private Cobalt cobalt;
    private Lithium lithium;

    /*
    * if we have multiple constructor in class then
    * we can only ise @inject with only one customer
    * */
    @Inject public Battery(Cobalt cobalt,Lithium lithium) {
        this.cobalt = cobalt;
        this.lithium = lithium;
    }
}
