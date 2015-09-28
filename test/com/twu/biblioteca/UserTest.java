package com.twu.biblioteca;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testCheckOutBook(){
        User tom = new User("Tom Hanks");
        tom.setloginStatus(true);
        int bookId = 12345;

        Book book = new Book("Martin","2010",12346);
        assertEquals(true, book.getAvailable());

        tom.checkOutBook(bookId);
        assertEquals(true,tom.getCheckoutBooks().contains(bookId));
    }
    @Test
    public void testReurnBook(){
        User tom = new User("Tom Hanks");
        tom.setloginStatus(true);
        int bookId = 12345;

        Book book = new Book("Martin","2010",12346);
        assertEquals(true, book.getAvailable());

        tom.checkOutBook(bookId);

        tom.returnBook(bookId);
        assertEquals(false,tom.getCheckoutBooks().contains(bookId));
    }

    @Test
    public void testUserInfo(){
        User tom = new User("Tom Hanks","tom@hw.com","13012345678");
        String info1 = tom.getUserInfo();
        assertEquals("",info1);

        tom.setloginStatus(true);
        String info2 = tom.getUserInfo();
        assertEquals("Name:Tom Hanks Email:tom@hw.com Telephone:13012345678", info2);
    }

}
