package com.ahmaddudayef.learndagger2.Example1;

import dagger.Component;

/**
 * Created by Ahmad Dudayef on 7/23/2018.
 */

@Component(modules = BraavosModule.class)
interface BattleComponent {
    War getWar();
    //adding more methods
//    Starks getStarks();
//    Boltons getBoltons();
    Cash getCash();
    Soldiers getSoldiers();
}

public class BattleOfBastards {

    public static void main(String[] args){
//        Mannual DI
//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//        War war = new War(starks,boltons);
//        war.prepare();
//        war.report();

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();
        //Using Dagger 2
        BattleComponent component = DaggerBattleComponent
                .builder().braavosModule(new BraavosModule(cash, soldiers)).build();
        War war = component.getWar();
        war.prepare();
        war.report();
        //using cash and soldiers
        component.getCash();
        component.getSoldiers();
    }
}
