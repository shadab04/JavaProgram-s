package exersice2;
import java.util.Scanner;
public class InputQuestion {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("Welcome "+name+" to KG coding");
    }
}
