package exersice2;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        if(num1%2==0)
        {
            System.out.println("This is Even number");
        }
        else{
            System.out.println("This is Odd number");
        }
    }
}
