package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.printWelcomeMsg();
    }

    public void printWelcomeMsg(){
        System.out.print("Welcome to Biblioteca!");
    }

    public int getBookListNumber(){
        Book[] BookList = new Book[2];
        BookList[0] = new Book();
        BookList[1] = new Book();

        return BookList.length;
    }
    public Book[] getBookListWithDetails(){
        Book[] bookList = new Book[2];
        bookList[0] = new Book("martin","2000");
        bookList[1] = new Book("Ben","1991");

        return bookList;
    }

    public TheOption[] getMainMenu() {
        TheOption[] mainmenus = new TheOption[1];
        mainmenus[0] = new TheOption("List Books", true);

        return mainmenus;
    }

    public ArrayList<Movie> getAvailableMovieListWithDetails() {
        ArrayList<Movie> movieList = new ArrayList<Movie>();
//        Movie[] movieList = new Movie[3];
//        movieList.add( new Movie(false, "Avatar", "James Camoron", 2008));
        movieList.add( new Movie(true, "Before sunset", "Richard Stuart Linklater", 2004));
        movieList.add( new Movie(true, "The Shawshank Redemption", "Frank Darabon", 1994));

//        for (int k=0;k<movieList.size();k++){
//            Movie movie = (Movie)movieList.get(k);
//            if (movie.getAvailableStatus() == false){
//                movieList.remove(movieList.get(k));
//            }
//        }
        return movieList;
    }

    public ArrayList<Movie> getAvailableMovieList() {
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add( new Movie(true, "Before sunset", "Richard Stuart Linklater", 2004));

        return movieList;
    }


    public ArrayList<Book> getBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("martin", "2000"));

        return bookList;
    }

    public boolean login(String libraryNumber,String passwordInput) {
        boolean result = false;
        boolean isExist = User.checkUserExistOrNot(libraryNumber);
        if (isExist && User.checkPassword(libraryNumber, passwordInput)) {
            User someUser = getUserByNumber(libraryNumber);
            result = true;
            someUser.setloginStatus(result);
        }
        return result;
    }

    public User getUserByNumber(String libraryNumber) {
        if ("1111-222" == libraryNumber) {
            return new User("Tom Hanks");
        } else if ("1111-333" == libraryNumber) {
            return new User("Justin");
        } else {
            System.out.println("Worry User Number");
            return new User("wrong");
        }
    }
}
