package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private boolean loginStatus;
    public List<Integer> checkoutBooks;

    public User(String userName) {
        this.userName = userName;
        this.loginStatus = false;
        checkoutBooks = new ArrayList<Integer>();
    }
    private boolean getLoginStatus() {
        return this.loginStatus;
    }

    public void setloginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }


    public static boolean checkPassword(String libraryNumber,String passwordInput){
        if (("1111-222" == libraryNumber && "abcdef" == passwordInput) || ("1111-333" == libraryNumber && "abcabc" == passwordInput)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkUserExistOrNot(String libraryNumber){
        if("1111-222" == libraryNumber || "1111-333" == libraryNumber){
            return true;
        }else{
            System.out.println("Sorry,user doesn't exist!");
            return false;
        }
    }


    public boolean checkOutBook(int bookId) {
        Book book = Book.getBookById(bookId);
        if(book.checkout()){
            int id = book.getBookId();
            this.setCheckoutBooks(id,true);
            return true;
        }else{
            return false;
        }
    }

    public boolean returnBook(int bookId) {
        Book book = Book.getBookById(bookId);
        if(book.beReturn()){
            this.setCheckoutBooks(bookId,false);
            return true;
        }else{
            return false;
        }
    }

    public List<Integer> getCheckoutBooks() {
        return this.checkoutBooks;
    }
    public void setCheckoutBooks(int id,boolean action){
        List<Integer> ids = this.getCheckoutBooks();
        if (action){
            ids.add(id);
        }else{
            for (int i=0;i<ids.size();i++){
                if (id == ids.get(i)){
                    ids.remove(i);
                }
            }
        }
        this.checkoutBooks = ids;
    }


}
