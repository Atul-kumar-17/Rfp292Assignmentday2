package com.bridgelabz.day2;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch +" is vowel");
                break;
            default:
                System.out.println(ch +" is consonant");
        }

    }
}
