package com.bridgelabz.day2;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();
        if(i==1){
            System.out.println("one");
        } else if (i==2) {
            System.out.println("two");
        } else if (i==3) {
            System.out.println("three");
        } else if (i==4) {
            System.out.println("four");
        } else if (i==5) {
            System.out.println("five");
        } else if (i==6) {
            System.out.println("six");
        } else if (i==7) {
            System.out.println("seven");
        } else if (i==8) {
            System.out.println("eight");
        } else if (i==9) {
            System.out.println("nine");
        } else if (i>=9) {
            System.out.println("Please enter the single digit number.");

        }

    }
}
