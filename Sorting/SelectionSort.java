package Sorting;

import java.util.Scanner;

public class SelectionSort {
    void selectionsort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int smallidx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[smallidx])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
         System.out.println("Enter the "+(i+1)+" Number:");
         arr[i]=sc.nextInt();   
        }
        SelectionSort s=new SelectionSort();
        s.selectionsort(arr,n);
        s.print(arr, n);
    }
}
