package Sorting;

public class BubbleSort {

    void bubblesort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean isbool = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isbool = true;
                }
            }
            if (isbool == false) {
                return;
            }
        }
    }
    void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]={5,9,3,2,1};
        BubbleSort b=new BubbleSort();
        b.bubblesort(arr,n);
        b.print(arr, n);
    }
}
