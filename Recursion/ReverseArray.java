public class ReverseArray {
    public static void reverseArray(int i, int j, int []arr){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        reverseArray(i+1, j-1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int size = arr.length;
        reverseArray(0,size-1,arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
