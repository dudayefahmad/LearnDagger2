package com.ahmaddudayef.learndagger2.Example2.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ahmaddudayef.learndagger2.Example2.MyApplication;
import com.ahmaddudayef.learndagger2.Example2.di.component.ApplicationComponent;
import com.ahmaddudayef.learndagger2.Example2.di.component.DaggerDetailActivityComponent;
import com.ahmaddudayef.learndagger2.Example2.di.component.DetailActivityComponent;
import com.ahmaddudayef.learndagger2.Example2.di.qualifier.ApplicationContext;
import com.ahmaddudayef.learndagger2.Example2.pojo.Film;
import com.ahmaddudayef.learndagger2.Example2.retrofit.APIInterface;
import com.ahmaddudayef.learndagger2.R;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {
    DetailActivityComponent detailActivityComponent;

    @Inject
    public APIInterface apiInterface;

    @Inject
    @ApplicationContext
    public Context mContext;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = findViewById(R.id.textView);

        String url = getIntent().getStringExtra("url");

        ApplicationComponent applicationComponent =
                MyApplication.get(this).getApplicationComponent();

        detailActivityComponent = DaggerDetailActivityComponent.builder()
                .applicationComponent(applicationComponent)
                .build();

        detailActivityComponent.inject(this);

        apiInterface.getFilmData(url, "json").enqueue(new Callback<Film>() {
            @Override
            public void onResponse(Call<Film> call, Response<Film> response) {
                Film films = response.body();
                String text = "Film name:\n" + films.title + "\nDirector:\n" + films.director;
                textView.setText(text);
            }

            @Override
            public void onFailure(Call<Film> call, Throwable t) {

            }
        });
    }
}
