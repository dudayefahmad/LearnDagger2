package com.ahmaddudayef.learndagger2.Example2.di.module;

import android.content.Context;

import com.ahmaddudayef.learndagger2.Example2.di.qualifier.ActivityContext;
import com.ahmaddudayef.learndagger2.Example2.di.scopes.ActivityScope;
import com.ahmaddudayef.learndagger2.Example2.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;
    public Context context;

    public MainActivityContextModule(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext(){
        return context;
    }
}
