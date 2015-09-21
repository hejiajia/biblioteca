package com.twu.biblioteca;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class TheOptionTest{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void getMsgWhenClickValidMainMenu(){
        int optionStatus = 1;
        TheOption invalidOption = new TheOption("invalid",optionStatus);

        System.setOut(new PrintStream(outContent));
        invalidOption.clickOption();

        assertEquals("Good choose!", outContent.toString());
    }

    @Test
     public void getMsgWhenClickInvalidMainMenu(){
        int optionStatus = -1;
        TheOption invalidOption = new TheOption("invalid",optionStatus);

        System.setOut(new PrintStream(outContent));
        invalidOption.clickOption();

        assertEquals("Select a valid option!",outContent.toString());
    }

}