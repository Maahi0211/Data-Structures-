public class Fibonacci {
    public static int fibo(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibo(n-2)+fibo(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}
