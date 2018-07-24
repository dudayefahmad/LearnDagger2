package com.ahmaddudayef.learndagger2.Example2.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface ActivityScope {
}
