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
        boolean optionStatus = true;
        TheOption validOption = new TheOption("validOption",optionStatus);

        System.setOut(new PrintStream(outContent));
        validOption.clickOption();

        assertEquals("Good choose!", outContent.toString());
    }

    @Test
     public void getMsgWhenClickInvalidMainMenu(){
        boolean optionStatus = false;
        TheOption invalidOption = new TheOption("invalid",optionStatus);

        System.setOut(new PrintStream(outContent));
        invalidOption.clickOption();

        assertEquals("Select a valid option!",outContent.toString());
    }

    @Test
    public void cannotClickOptionAfterClickQuit(){
        System.setOut(new PrintStream(outContent));

        TheOption quitOption = new TheOption("Quit",true);
        quitOption.clickOption();

        outContent.reset();

        TheOption validOption = new TheOption("validOption",true);
        validOption.clickOption();

        assertEquals("Sorry,you can't choose option after you quit!", outContent.toString());
    }

}