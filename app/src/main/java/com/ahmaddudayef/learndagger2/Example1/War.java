package com.ahmaddudayef.learndagger2.Example1;

import javax.inject.Inject;

/**
 * Created by Ahmad Dudayef on 7/23/2018.
 */

public class War {
    private Starks starks;

    private Boltons boltons;

    @Inject
    public War(Starks starks, Boltons boltons){
        this.starks = starks;
        this.boltons = boltons;
    }

    public void prepare() {
        starks.prepareForWar();
        boltons.prepareForWar();
    }

    public void report() {
        starks.reportForWar();
        boltons.reportForWar();
    }
}
