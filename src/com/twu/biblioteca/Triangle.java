package com.twu.biblioteca;

public class Triangle {

    public void drawInSameLine(int number,String element){
        for (int n=number;n>0;n--){
            System.out.print(element);
        }
    }

    public void drawHorizontalLine(int number) {
        this.drawInSameLine(number,"*");
    }

    public void drawVerticalLine(int number){
        this.drawInSameLine(number,"*\n");
    }

    public void drawRightTriangle(int number) {
        for (int m=1;m<=number;m++){
            this.drawInSameLine(m,"*");
            System.out.println("");
        }
    }

    public void drawRightIsosceles(int number) {
        for (int m=1;m<=number;m++){
            this.drawInSameLine(number-m," ");
            this.drawInSameLine(2*m-1,"*");
            System.out.print("\n");
        }
    }


    public void drawDiamondTriangle(int number) {
        this.drawRightIsosceles(number);
        for (int m=number-1;m>0;m--){
            this.drawInSameLine(number-m," ");
            this.drawInSameLine(2*m-1,"*");
            System.out.print("\n");
        }
    }


    public void drawDiamondTriangleWithName(int number, String name) {
        for (int m=1;m<number;m++){
            this.drawInSameLine(number-m," ");
            this.drawInSameLine(2*m-1,"*");
            System.out.print("\n");
        }
        System.out.println(name);
        for (int m=number-1;m>0;m--){
            this.drawInSameLine(number-m," ");
            this.drawInSameLine(2*m-1,"*");
            System.out.print("\n");
        }
    }

    public void FizzBuzz(int n){
        for (int k=1;k<=n;k++){
            if (0 == k%3){
                System.out.print("Fizz");
                if (0 == k%5) {
                    System.out.print("Buzz");
                }
            }else if (0 == k%5){
                System.out.print("Buzz");
            }else{
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }

    public void primeFactor(int number) {
        for (int n=2;n<number/2;n++){
            if (0 == number%n && isPrimeNumber(n)){
                System.out.print(n+" ");
            }
        }
    }

    private boolean isPrimeNumber(int n){
        boolean isPrime = true;
        for(int i=2;i<n/2;i++){
            if (0 == n%i){
                isPrime = false;
            }
        }
        return isPrime;
    }

}
