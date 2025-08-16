import java.time.Year;
import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		System.out.println("Welcome to simple interest calculator");
        System.out.println("please,Enter the Principle Amount:");
        int PAmount=input.nextInt();
        System.out.println("please,Enter the rate of Interest:");
        float Rate=input.nextFloat();
        System.out.println("Now ,Tell me about for how many time borrowing the money:");
        float years=input.nextFloat();
        float simple_interest=(PAmount*Rate*years)/100;
        System.out.println("the Simple interest is: "+simple_interest);
    }
}