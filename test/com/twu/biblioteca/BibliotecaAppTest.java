package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


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
    public void getTheBookList(){}


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

        assertEquals(expectedBookList[0].toString(),bookList[0].toString());
        assertEquals(expectedBookList[1].toString(),bookList[1].toString());
    }
    @Test
    public void checkMainMenu(){
        String nameOfOption = "List Books";
        int lenthOfMainMenu = 1;

        TheOption[] mainMenu = new BibliotecaApp().getMainMenu();

        assertEquals(lenthOfMainMenu,mainMenu.length);
        assertEquals(nameOfOption,mainMenu[0].toString());
    }


}
