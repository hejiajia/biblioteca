package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.List;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void welcomeMessageWhenAppStarted(){
        System.setOut(new PrintStream(outContent));

        new BibliotecaApp().printWelcomeMsg();
        assertEquals("Welcome to Biblioteca!",outContent.toString());
    }

    @Test
    public void getBookListNumberOnly(){
        int BookNumber = new BibliotecaApp().getBookListNumber();
        assertEquals(2,BookNumber);
    }

    @Test
    public void checkBookListWithDetails(){
        Book[] expectedBookList = new Book[2];
        expectedBookList[0] = new Book("martin","2000");
        expectedBookList[1] = new Book("Ben","1991");

        Book[] bookList = new BibliotecaApp().getBookListWithDetails();

        assertEquals(expectedBookList.length,bookList.length);
        assertEquals(true,expectedBookList[0].equals(bookList[0]));
        assertEquals(true,expectedBookList[1].equals(bookList[1]));
    }

    @Test
    public void checkMainMenu(){
        String nameOfOption = "List Books";
        int lenthOfMainMenu = 1;

        TheOption[] mainMenu = new BibliotecaApp().getMainMenu();

        assertEquals(lenthOfMainMenu,mainMenu.length);
        assertEquals(nameOfOption, mainMenu[0].getName());
    }

    @Test
    public void testGetMovieListWithDetails(){

    }


    @Test
    public void testGetMovieList(){
        ArrayList<Movie> expectedMovieList = new ArrayList<Movie>();
        expectedMovieList.add(new Movie(true, "Before sunset", "Richard Stuart Linklater", 2004));
        expectedMovieList.add(new Movie(true, "The Shawshank Redemption", "Frank Darabon", 1994));

        ArrayList<Movie> movieList = new BibliotecaApp().getAvailableMovieListWithDetails();

        assertEquals(expectedMovieList.size(),movieList.size());
        assertEquals(true, ((Movie) expectedMovieList.get(0)).equals((Movie) movieList.get(0)));
        assertEquals(true, ((Movie) expectedMovieList.get(1)).equals((Movie) movieList.get(1)));
    }

    @Test
    public void  checkLoginSuccessfully(){
        String libraryNumber = "1111-222";
        String passwordInput = "abcdef";
        Boolean result = new BibliotecaApp().login(libraryNumber, passwordInput);
        assertEquals(true,result);
    }

    @Test
    public void  checkLoginfailed(){
        String libraryNumber = "1111-222";
        String passwordInput = "123456";
        Boolean result = new BibliotecaApp().login(libraryNumber, passwordInput);
        assertEquals(false,result);
    }


}
