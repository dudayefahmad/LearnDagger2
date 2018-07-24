package com.ahmaddudayef.learndagger2.Example2.retrofit;

import com.ahmaddudayef.learndagger2.Example2.pojo.Film;
import com.ahmaddudayef.learndagger2.Example2.pojo.StarWars;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

public interface APIInterface {
    @GET("people/?")
    Call<StarWars> getPeople(@Query("format") String format);

    @GET
    Call<Film> getFilmData(@Url String url, @Query("format") String format);
}
