import java.util.Scanner;

public class SquareRoot {
    void squareroot(double n)
    {
        double x=Math.sqrt(n);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        double n=sc.nextDouble();
        SquareRoot s=new SquareRoot();
        s.squareroot(n);
    }
}
