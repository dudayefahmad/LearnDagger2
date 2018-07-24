package com.ahmaddudayef.learndagger2.Example2.di.module;

import com.ahmaddudayef.learndagger2.Example2.adapter.RecyclerViewAdapter;
import com.ahmaddudayef.learndagger2.Example2.di.scopes.ActivityScope;
import com.ahmaddudayef.learndagger2.Example2.ui.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {

    @Provides
    @ActivityScope
    public RecyclerViewAdapter getStarWarsPeopleList(RecyclerViewAdapter.ClickListener clickListener) {
        return new RecyclerViewAdapter(clickListener);
    }

    @Provides
    @ActivityScope
    public RecyclerViewAdapter.ClickListener getClickListener(MainActivity mainActivity){
        return mainActivity;
    }
}
