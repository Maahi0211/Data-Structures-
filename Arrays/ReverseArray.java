public class ReverseArray { 

    static void reverse(int [] arr, int n){
        int temp;
        for (int i=0; i<n/2; i++){
            temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 7, 3, 1, 9};
        int n=arr.length;
        reverse(arr, n);
    }
}
