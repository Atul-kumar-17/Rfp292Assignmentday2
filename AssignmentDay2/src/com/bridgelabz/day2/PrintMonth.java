package com.bridgelabz.day2;

import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4 :
                System.out.println("april");
                break;
            case 5 :
                System.out.println("may");
                break;
            case 6 :
                System.out.println("june");
                break;
            case 7 :
                System.out.println("july");
                break;
            case 8 :
                System.out.println("august");
                break;
            case 9 :
                System.out.println("september");
                break;
            case 10 :
                System.out.println("october");
                break;
            case 11 :
                System.out.println("november");
                break;
            case 12 :
                System.out.println("december");
                break;
            default:
                System.out.println("Not a valid number.");
        }
    }
}
