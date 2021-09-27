package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i=number; i>=0; i--) {
            int lineLength = number - i;
            //System.out.println(i);
            //System.out.println(lineLength);
            for(int n=1; n<=lineLength; n++){
                if (n == 1){
                    System.out.println();
                    System.out.print(n);
                }else{
                    System.out.print(n);
                }
            }
        }

        for (int i=1; i<number; i++) {
            int lineLength = number - i;
            //System.out.println(i);
            //System.out.println(lineLength);
            for(int n=1; n<=lineLength; n++){
                if (n == 1){
                    System.out.println();
                    System.out.print(n);
                }else{
                    System.out.print(n);
                }
            }
        }
    }
}
