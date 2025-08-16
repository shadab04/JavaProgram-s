import java.util.Scanner;
public class ConvertInForenheite {
    public static void main(String[] args) {
        System.out.println("Welcome to Temperature converter");
        Scanner sc=new Scanner(System.in);
        float forenheite=sc.nextFloat();
        float celcius=(forenheite-32)*5/ 9;
        System.out.println("the temperature in celcius: "+ celcius +"C");
    }
}
