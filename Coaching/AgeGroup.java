import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please the the age: ");
        int age=input.nextInt();
        if(age<13)
        {
            System.out.println(age+" this is child");
        }
        else if(age<20)
        {
            System.out.println(age+" this is Teen");
        }
        else if(age<60)
        {
            System.out.println(age+" this is adult");
        }
        else
        {
            System.out.println(age+" this is Senior");
        }
    }
}
