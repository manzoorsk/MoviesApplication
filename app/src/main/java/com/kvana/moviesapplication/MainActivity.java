package com.kvana.moviesapplication;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<MoviePic> movieList = new ArrayList<>();
    private RecyclerView moviesRV;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesRV = (RecyclerView) findViewById(R.id.movies_RV);
        mAdapter=new MoviesAdapter(movieList);
        RecyclerView.LayoutManager lmanager= new LinearLayoutManager(getApplicationContext());
        moviesRV.setLayoutManager(lmanager);
        moviesRV.setItemAnimator(new DefaultItemAnimator());
        moviesRV.setAdapter(mAdapter);

     prepairMovieData();
    }
    private void prepairMovieData(){
        MoviePic movie = new MoviePic("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);
        movie = new MoviePic("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new MoviePic("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new MoviePic("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new MoviePic("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new MoviePic("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new MoviePic("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new MoviePic("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new MoviePic("The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new MoviePic("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new MoviePic("Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new MoviePic("Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new MoviePic("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new MoviePic("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new MoviePic("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new MoviePic("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);

        movie = new MoviePic("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);

        movie = new MoviePic("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);


        mAdapter.notifyDataSetChanged();

    }

}
