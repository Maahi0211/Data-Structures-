public class SumOfElements {

    static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 55, 30, 7, 77, 88};
        sumOfArray(arr);
    }

}


