package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class BookTest{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void checkoutBookSuccessfully(){
        Book wantedBook = new Book("Martin","2010");
        wantedBook.checkout();
        assertEquals(false,wantedBook.getAvailable());
    }

    @Test
    public void checkoutBookMsg(){
        System.setOut(new PrintStream(outContent));

        Book wantedBook = new Book("Martin","2010");
        wantedBook.checkout();

        assertEquals("Thank you! Enjoy the book!",outContent.toString());
    }

    @Test
    public void checkoutBookFaild(){
        System.setOut(new PrintStream(outContent));

        Book wantedBook = new Book("Martin","2010");
        wantedBook.setAvailable(false);
        wantedBook.checkout();

        assertEquals("That book is not available.",outContent.toString());
    }

    @Test
    public void bookBeReturn(){
        Book wantedBook = new Book("Martin","2010",111);
        wantedBook.checkout();
        wantedBook.beReturn();
        assertEquals(true,wantedBook.getAvailable());
    }

    @Test
    public void bookBeReturnSuccessfully(){
        System.setOut(new PrintStream(outContent));

        Book wantedBook = new Book("Java Book","2010",12345);
        wantedBook.beReturn();

        assertEquals("Thank you for returning the book.",outContent.toString());
    }

    @Test
    public void bookBeReturnFailed(){
        System.setOut(new PrintStream(outContent));

        Book wantedBook = new Book("Martin","2010",12346);
        wantedBook.beReturn();

        assertEquals("That is not a valid book to return.",outContent.toString());
    }

}