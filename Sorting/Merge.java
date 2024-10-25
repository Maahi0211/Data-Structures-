import java.util.Scanner;

public class Merge{
    public static void merge(int []arr, int left, int mid, int right){
        // finding the length of two subarrays 
        int size1=mid-left+1;
        int size2=right-mid;

        int []leftArray=new int[size1];
        int []rightArray=new int[size2];

        for(int i=0; i<size1; i++){
            leftArray[i]=arr[left+i];
        }

        for(int i=0; i<size2; i++){
            rightArray[i]=arr[mid+1+i];
        }

        int i=0, j=0, k=left;
        while(i<size1 && j<size2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }
            else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<size1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<size2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int []arr, int left, int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        mergeSort(arr, 0, arr.length-1);

        for(int value:arr){
            System.out.print(value+" ");
        }
        sc.close();
    }
}