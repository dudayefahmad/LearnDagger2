package com.ahmaddudayef.learndagger2.Example2;

import android.app.Activity;
import android.app.Application;

import com.ahmaddudayef.learndagger2.Example2.di.component.ApplicationComponent;
import com.ahmaddudayef.learndagger2.Example2.di.component.DaggerApplicationComponent;
import com.ahmaddudayef.learndagger2.Example2.di.module.ContextModule;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

public class MyApplication extends Application {
    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
        applicationComponent.injectApplication(this);
    }

    public static MyApplication get(Activity activity){
        return (MyApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
