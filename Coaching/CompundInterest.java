import java.util.Scanner;
public class CompundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Compund interest calculator");
        System.out.println("please,Enter the Principle Amount:");
        float PAmount=input.nextFloat();
        System.out.println("please,Enter the rate of Interest:");
        float Rate=input.nextFloat();
        System.out.println("Now ,Tell me about for how many time borrowing the money:");
        float years=input.nextFloat();
        double Compund_interest=PAmount*Math.pow((1+Rate)/100,years);
        System.out.println("the Simple interest is: "+Compund_interest);
    }
}