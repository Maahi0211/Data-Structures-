public class BinarySearch {
    public static boolean binarySearch(int i, int j, int[] arr, int x){
        int mid=(i+j)/2;
        if(i>j){
            return false;
        }
        if(arr[mid]==x){
            return true;
        }
        if(x<arr[mid]){
            return binarySearch(i,mid-1,arr,x);
        }
        if(x>arr[mid]){
            return binarySearch(mid+1,j,arr,x);
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr={4, 5, 7, 8, 9, 11, 13, 14};
        int size=arr.length;
        int x=144;
        System.out.println(binarySearch(0, size-1, arr, x));
    }
}
