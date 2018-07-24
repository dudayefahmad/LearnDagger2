package com.ahmaddudayef.learndagger2.Example2.di.component;

import com.ahmaddudayef.learndagger2.Example2.di.scopes.ActivityScope;
import com.ahmaddudayef.learndagger2.Example2.ui.DetailActivity;

import dagger.Component;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

@Component(dependencies = ApplicationComponent.class)
@ActivityScope
public interface DetailComponent {

    void inject(DetailActivity detailActivity);
}
