import java.util.Scanner;

public class EvenOdd {
    void evenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println(n+" is Even number");
        }
        else{
            System.out.println(n+" is Odd number");
        }
    }
    public static void main(String[] args) {
        EvenOdd e=new EvenOdd();
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        e.evenOdd(n);
    }
}
