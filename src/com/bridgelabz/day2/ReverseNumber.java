package com.bridgelabz.day2;

public class ReverseNumber {
    public static void main(String[] args) {
        int i = 231;
        System.out.println("original number "+i);
        int reverse = 0;
        while (i!=0){
            int remainder = i % 10;
            reverse = reverse *10+remainder;
            i= i/10;
        }
        System.out.println("Reverse of the number is = "+reverse);
    }
}
