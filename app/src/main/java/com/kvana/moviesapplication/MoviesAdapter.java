package com.kvana.moviesapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kvana Inc 12 on 6/17/2016.
 */
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyHolder> {
//    private Context context;
    private List<MoviePic> moviesList;

    public MoviesAdapter(List<MoviePic> moviesList){
        this.moviesList = moviesList;

    }

    public class MyHolder extends RecyclerView.ViewHolder {
        public TextView title,year, genre;


        public MyHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.textView);
            year = (TextView) view.findViewById(R.id.textView2);
            genre = (TextView) view.findViewById(R.id.textView3);
        }
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_moview_item, parent, false);

        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
       MoviePic moviePic=moviesList.get(position);
        holder.title.setText(moviePic.getYear());
        holder.year.setText(moviePic.getYear());
        holder.genre.setText(moviePic.getGenre());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

}
