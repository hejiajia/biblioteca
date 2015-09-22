package com.twu.biblioteca;

public class TheOption {

    private boolean optionStatus;
    private String name;
    public static boolean overallStatus = true;

    public TheOption(String name, boolean optionStatus){
        this.name = name;
        this.optionStatus = optionStatus;
    }

    public String getName() {
        return name;
    }


    public void clickOption() {
        if (true == overallStatus){
            if (false == this.getStatus()){
                System.out.print("Select a valid option!");
            }else if("Quit" == this.getName()){
                overallStatus = false;
            }else{
                System.out.print("Good choose!");
            }
        }else{
            System.out.print("Sorry,you can't choose option after you quit!");
        }

    }

    private boolean getStatus() {
        return this.optionStatus;
    }
}
