package com.twu.biblioteca;

public class Book {

    private String author;
    private String yearPublished;
    private boolean available = true;
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

    public boolean checkout() {
        if (this.getAvailable()) {
            System.out.print("Thank you! Enjoy the book!");
            this.setAvailable(false);
            return true;
        }else{
            System.out.print("That book is not available.");
            return false;
        }
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }else {
            if(this.getClass() == obj.getClass()){
                Book book = (Book) obj;
                if(this.getAuthorName().equals(book.getAuthorName())){
                    return true;
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }
    }

    private String getAuthorName() {
        return this.author;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public boolean beReturn() {
        if (this.getBookValidById()){
            this.setAvailable(true);
            System.out.print("Thank you for returning the book.");
            return true;
        }else {
            System.out.print("That is not a valid book to return.");
        }
        return false;
    }

    public boolean getBookValidById(){
        //pretend to get info from DB
        if (1 == this.bookId%2){
            return true;
        }else{
            return false;
        }
    }

    public static Book getBookById(int bookId) {
        if (bookId%2 == 1){
            return new Book("Martin","2010",bookId);
        }else{
            return new Book("Java","2000",bookId);
        }
    }


    public int getBookId() {
        return this.bookId;
    }
}
