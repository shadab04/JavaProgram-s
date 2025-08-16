// // import java.net.Socket;
// import java.util.Scanner;
// // import java.util.Vector;
// public class SecondLargestElement {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Size of the array:");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         int FirstMax=Integer.MIN_VALUE,SecondMax=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++)
//         {
//             System.out.print("Enter the "+(i+1)+"number:");
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]>FirstMax)
//             {
//                 FirstMax=arr[i];
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             if((arr[i]>SecondMax)&&(arr[i]<FirstMax))
//             {
//                 SecondMax=arr[i];
//             }
//         }
//         if(SecondMax==Integer.MIN_VALUE)
//         {
//             System.out.println("-1");
//         }
//         else{
//             System.out.println(SecondMax);
//         }
//     }
// }
