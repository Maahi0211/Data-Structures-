import java.util.Scanner;


// in bubble sort, we swap the element with its adjacent element until it is at its correct index


public class Bubble{
    public static void bubble(int []arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        bubble(arr);
        System.out.println("Sorted array:");
        for(int value : arr){
            System.out.print(value +" ");
        }
        sc.close();
    }
}