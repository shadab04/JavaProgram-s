package TUSION.ExceptionHandling;

public class UseOfThrow {
//  public static void main(String[] args) {
//     // System.out.println(10/0);
//     throw new ArithmeticException("/by zero");
//  }   
// static ArithmeticException e=new ArithmeticException();
static ArithmeticException e;
public static void main(String[] args) {
    throw e;
}
}