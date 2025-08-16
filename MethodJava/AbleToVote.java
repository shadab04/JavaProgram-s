import java.util.Scanner;

public class AbleToVote {
    void ableToVote(int age)
    {
        if(age>=18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You can't vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        AbleToVote a=new AbleToVote();
        a.ableToVote(age);
    }
}
