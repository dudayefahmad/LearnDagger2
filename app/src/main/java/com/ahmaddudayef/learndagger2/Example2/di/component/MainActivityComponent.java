package com.ahmaddudayef.learndagger2.Example2.di.component;

import android.content.Context;

import com.ahmaddudayef.learndagger2.Example2.di.module.AdapterModule;
import com.ahmaddudayef.learndagger2.Example2.di.qualifier.ActivityContext;
import com.ahmaddudayef.learndagger2.Example2.di.scopes.ActivityScope;
import com.ahmaddudayef.learndagger2.Example2.ui.MainActivity;

import dagger.Component;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

@Component(modules = AdapterModule.class, dependencies = ApplicationComponent.class)
@ActivityScope
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}
