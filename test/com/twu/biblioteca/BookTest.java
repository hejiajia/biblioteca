package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest{

    @Test
    public void checkoutBook(){
        Book wantedBook = new Book("Martin","2010");
        wantedBook.checkout();
        assertEquals(false,wantedBook.getAvailable());
    }

}