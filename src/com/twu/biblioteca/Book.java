package com.twu.biblioteca;

public class Book {

    private String author;
    private String yearPublished;
    private boolean available;
    private int bookId;

    public Book(){}

    public Book(String author,String yearPublished) {
        this.author = author;
        this.yearPublished = yearPublished;
        this.available = true;
        this.bookId = 0;
    }

    public Book(String author,String yearPublished,int bookId) {
        new Book(author,yearPublished);
        this.bookId = bookId;
    }

    public void checkout() {
        if (this.getAvailable()) {
            System.out.print("Thank you! Enjoy the book!");
            this.setAvailable(false);
        }else{
            System.out.print("That book is not available.");
        }
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void beReturn() {
        if (this.getBookValidById()){
            this.setAvailable(true);
            System.out.print("Thank you for returning the book.");
        }else {
            System.out.print("That is not a valid book to return.");
        }
    }

    public boolean getBookValidById(){
        //pretend to get info from DB
        if (1 == this.bookId%2){
            return true;
        }else{
            return false;
        }
    }

}
