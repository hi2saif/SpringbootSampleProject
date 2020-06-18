package io.javabrains.movieinfoservice.models;

public class Movie {

    private String MovieId;

    public String getMovieId() {
        return MovieId;
    }

    public Movie() {
    }

    public void setMovieId(String movieId) {
        MovieId = movieId;
    }

    public Movie(String movieId, String name) {
        MovieId = movieId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
