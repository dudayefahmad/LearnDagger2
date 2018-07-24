package com.ahmaddudayef.learndagger2.Example2.di.module;

import com.ahmaddudayef.learndagger2.Example2.di.scopes.ApplicationScope;
import com.ahmaddudayef.learndagger2.Example2.retrofit.APIInterface;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module
public class RetrofitModule {

    @Provides
    @ApplicationScope
    APIInterface getApiInterface(Retrofit retrofit){
        return retrofit.create(APIInterface.class);
    }

    @Provides
    @ApplicationScope
    Retrofit getRetrofit(OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .baseUrl("https://swapi.co/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Provides
    @ApplicationScope
    OkHttpClient getOkhttpClient(HttpLoggingInterceptor httpLoggingInterceptor){
        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
    }

    @Provides
    @ApplicationScope
    HttpLoggingInterceptor getHttpLoogingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }
}
