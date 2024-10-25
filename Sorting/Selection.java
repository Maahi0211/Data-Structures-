import java.util.Scanner;

public class Selection{
    public static void select(int []arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        select(arr);

        for(int value : arr){
            System.out.print(value+" ");
        }

        sc.close();
    }
}