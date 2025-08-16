// import java.util.Scanner;
// import java.util.Vector;

// public class FirstAndSecondMinElement {
//     public static void main(String[] args) {
//         Vector<Integer> Result = new Vector<>();
//         Scanner sc = new Scanner(System.in);
//         // for input from user
//         System.out.println("Enter the size of the array ");
//         int n = sc.nextInt();
//         // array declare
//         int arr[] = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Enter the " + (i + 1) + " number ");
//             arr[i] = sc.nextInt();
//         }
//         int FirstMin = Integer.MAX_VALUE, SecondMin = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < FirstMin) {
//                 FirstMin = arr[i];
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if ((arr[i] < SecondMin) && (arr[i] > FirstMin)) {
//                 SecondMin = arr[i];
//             }
//         }
//         if (SecondMin == Integer.MAX_VALUE) {
//             Result.add(-1);
//         } else {
//             Result.add(FirstMin);
//             Result.add(SecondMin);
//         }
//         System.out.println(Result);
//     }
// }
