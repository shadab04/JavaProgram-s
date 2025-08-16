import java.util.Scanner;

public class Multiply {
    // void multiply(int a,int b)
    // {
    //     int ans=a*b;
    //     System.out.println(ans);
    // }
    //with return
      int multiply(int a,int b)
    {
        int ans=a*b;
        return ans;
    }
public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the First Number:");
    // int a=sc.nextInt();
    // System.out.println("Enter the second Number:");
    // int b=sc.nextInt();
    Multiply m=new Multiply();
    // m.multiply(4, 7);
    // m.multiply(4, 5);
    // m.multiply(4, 10);
    int result1=m.multiply(5,4);
    int result2=m.multiply(10,4);
    int result3=m.multiply(15,4);
    
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
}    
}
