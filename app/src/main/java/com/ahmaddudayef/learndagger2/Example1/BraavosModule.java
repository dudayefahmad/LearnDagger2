package com.ahmaddudayef.learndagger2.Example1;

import com.ahmaddudayef.learndagger2.Example1.Cash;
import com.ahmaddudayef.learndagger2.Example1.Soldiers;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/23/2018.
 */

@Module // The module
public class BraavosModule {
    Cash cash;
    Soldiers soldiers;

    public BraavosModule(Cash cash, Soldiers soldiers){
        this.cash = cash;
        this.soldiers = soldiers;
    }

    @Provides //Provides cash dependency
    Cash provideCash() {
        return cash;
    }

    @Provides //Provides soldiers dependency
    Soldiers provideSoldiers() {
        return soldiers;
    }
}
