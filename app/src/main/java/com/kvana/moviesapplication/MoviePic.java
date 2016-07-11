package com.kvana.moviesapplication;

/**
 * Created by Kvana Inc 12 on 7/11/2016.
 */
public class MoviePic {
    private String title, genre, year;
    public MoviePic() {
    }

    public MoviePic(String title, String genre, String year) {
        this.title = title;
        this.year = year;
        this.genre = genre;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
