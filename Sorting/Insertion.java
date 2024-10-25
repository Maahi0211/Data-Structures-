import java.util.Scanner;

public class Insertion{
    public static void insert(int []arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int min=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>min){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        insert(arr);
        for(int value:arr){
            System.out.print(value+" ");
        }
        sc.close();
    }
}