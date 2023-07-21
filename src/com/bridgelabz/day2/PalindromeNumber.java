package com.bridgelabz.day2;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x,sum=0,temp;
        int n= 555;
        temp=n;
        while(n>0){
            x= n%10;
            sum = (sum*10)+x;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome number");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
