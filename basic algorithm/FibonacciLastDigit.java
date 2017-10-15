import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
    	int[] list = new int [n+1];
    	list[0] = 0;
    	list[1] = 1;
        int i;
        for (i = 2;i<=n ;i++ ){
        	list[i] = (list[i-1] + list[i-2])%10;
        }
        return list[n];
      }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

