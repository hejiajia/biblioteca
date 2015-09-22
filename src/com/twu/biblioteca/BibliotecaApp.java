package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.printWelcomeMsg();
    }

    public void printWelcomeMsg(){
        System.out.print("Welcome to Biblioteca!");
    }

    public int getBookListNumber(){
        Book[] BookList = new Book[2];
        BookList[0] = new Book();
        BookList[1] = new Book();

        return BookList.length;
    }
    public Book[] getBookListWithDetails(){
        Book[] bookList = new Book[2];
        bookList[0] = new Book("martin","2000");
        bookList[1] = new Book("Ben","1991");

        return bookList;
    }

    public TheOption[] getMainMenu() {
        TheOption[] listBooks = new TheOption[1];
        String name = "List Books";
        listBooks[0] = new TheOption(name, true);

        return listBooks;
    }


}
