package com.ahmaddudayef.learndagger2.Example1;

import javax.inject.Inject;

/**
 * Created by Ahmad Dudayef on 7/23/2018.
 */

public class Boltons implements House {

    @Inject
    public Boltons() {

    }

    @Override
    public void prepareForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        //do something
        System.out.println(this.getClass().getSimpleName()+" reporting");
    }
}
