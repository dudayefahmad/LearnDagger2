package com.ahmaddudayef.learndagger2.Example2.di.module;

import android.content.Context;

import com.ahmaddudayef.learndagger2.Example2.di.qualifier.ApplicationContext;
import com.ahmaddudayef.learndagger2.Example2.di.scopes.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext(){
        return context;
    }
}
