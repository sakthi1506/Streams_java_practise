package com.Stream;

public class Movies {

    private  String movieName;
    private int releaseYear;
    private  String actor;

    public Movies(String movieName, int releaseYear, String actor) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
        this.actor = actor;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public  String toString(){

        return  getMovieName()+"  "+getActor()+"  "+getReleaseYear();
    }


}
