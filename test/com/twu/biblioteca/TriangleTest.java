package com.twu.biblioteca;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testDrawHorizontalLine(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 8;
        triangle.drawHorizontalLine(number);

        assertEquals("********",outContent.toString());
    }

    @Test
    public void testDrawVerticalLine(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 3;
        triangle.drawVerticalLine(number);

        assertEquals("*\n*\n*\n",outContent.toString());
    }

    @Test
    public void testDrawRightTriangle(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 3;
        triangle.drawRightTriangle(number);

        assertEquals("*\n**\n***\n",outContent.toString());
    }

    @Test
    public void testDrawIsoscelesTriangle(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 3;
        triangle.drawRightIsosceles(number);

        assertEquals("  *\n ***\n*****\n",outContent.toString());
    }

    @Test
    public void testDiamondTriangle(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 3;
        triangle.drawDiamondTriangle(number);

        assertEquals("  *\n ***\n*****\n ***\n  *\n",outContent.toString());
    }

    @Test
    public void testDiamondTriangleWithName(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 3;
        String name = "Bill";
        triangle.drawDiamondTriangleWithName(number, name);

        assertEquals("  *\n ***\nBill\n ***\n  *\n",outContent.toString());
    }

    @Test
    public void testFizzBuzz(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 15;
        triangle.FizzBuzz(number);

        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n",outContent.toString());
    }

    @Test
    public void testPrimaryFactor(){
        System.setOut(new PrintStream(outContent));

        Triangle triangle = new Triangle();
        int number = 30;
        triangle.primeFactor(number);

        assertEquals("2 3 5 ",outContent.toString());
    }

}