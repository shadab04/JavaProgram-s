import java.util.Scanner;
class WhatTypeNum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num<0)
        {
            System.out.println(num+" this number is negative");
        }
        else if(num==0)
        {
            System.out.println(num+" this number is zero");
        }
        else
        {
            System.out.println(num+" this number is positive");
        }
    }
}