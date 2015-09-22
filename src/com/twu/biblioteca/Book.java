package com.twu.biblioteca;

public class Book {

    private String author;
    private String yearPublished;
    private boolean available;

    public Book(){}

    public Book(String author,String yearPublished) {
        this.author = author;
        this.yearPublished = yearPublished;
        this.available = true;
    }

    public void checkout() {
        this.setAvailable(false);
        System.out.print("Thank you! Enjoy the book!");
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public boolean getAvailable() {
        return this.available;
    }

}
