package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    @Test
    public void testCheckOutMovie(){
        Movie wantedMovie = new Movie(true, "Avatar", "James Camoron", 2008);
        wantedMovie.checkout();
        assertEquals(false, wantedMovie.getAvailableStatus());
    }


}
