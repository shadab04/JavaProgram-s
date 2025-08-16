import java.util.Scanner;

public class PowOfNumber {
    void powNum(double a,double b)
    {
       double ans=Math.pow(a,b);
       System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        double a=sc.nextDouble();
         System.out.println("Enter the power:");
          double b=sc.nextDouble();
        PowOfNumber p=new PowOfNumber();
        p.powNum(a,b);
    }
}
