package com.twu.biblioteca;


public class Movie {
    private boolean availableStatus;
    private String movieName;
    private String director;
    private int year;

    public Movie(boolean availableStatus, String movieName, String director, int year) {
        this.availableStatus = availableStatus;
        this.movieName = movieName;
        this.director = director;
        this.year = year;
    }

    public boolean getAvailableStatus() {
        return this.availableStatus;
    }

    private void setAvailableStatus(boolean status) {
        this.availableStatus = status;
    }

    public String getMovieName(){
        return this.movieName;
    }

    public String getDirector(){
        return this.director;
    }

    public int getYear() {
        return this.year;
    }

    public void checkout() {
        if (this.getAvailableStatus()) {
            System.out.print("Thank you! Enjoy the movie!");
            this.setAvailableStatus(false);
        }else{
            System.out.print("That Movie is not available.");
        }
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }else {
            if(this.getClass() == obj.getClass()){
                Movie movie = (Movie) obj;
                if(this.getMoiveName().equals(movie.getMovieName())){
                    return true;
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }
    }

    private String getMoiveName() {
        return this.movieName;
    }

}
