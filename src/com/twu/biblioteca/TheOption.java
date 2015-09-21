package com.twu.biblioteca;

public class TheOption {

    private int optionStatus;
    private String name;

    public TheOption(String name, int optionStatus){
        this.name = name;
        this.optionStatus = optionStatus;
    }

    public String getName() {
        return name;
    }


    public void clickOption() {
        if (-1 == this.getStatus()){
            System.out.print("Select a valid option!");
        }else{
            System.out.print("Good choose!");
        }
    }

    private int getStatus() {
        return this.optionStatus;
    }
}
