package com.ahmaddudayef.learndagger2.Example2.di.component;

import android.content.Context;

import com.ahmaddudayef.learndagger2.Example2.MyApplication;
import com.ahmaddudayef.learndagger2.Example2.di.module.ContextModule;
import com.ahmaddudayef.learndagger2.Example2.di.module.RetrofitModule;
import com.ahmaddudayef.learndagger2.Example2.di.qualifier.ApplicationContext;
import com.ahmaddudayef.learndagger2.Example2.di.scopes.ApplicationScope;
import com.ahmaddudayef.learndagger2.Example2.retrofit.APIInterface;

import dagger.Component;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {
    APIInterface getApiInterface();

    @ApplicationContext
    Context getContext();

    void injectApplication(MyApplication myApplication);
}
