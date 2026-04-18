package MethodRecursion;

// A Perfect Number is a number that is equal to the sum of its proper divisors (divisors excluding the number itself).

// Example:
// For 6
// Divisors → 1, 2, 3
// Sum → 1 + 2 + 3 = 6

public class PerfectNum1 {
  public static void main(String[] args) {
    int n =6;
    System.out.println(isPerfectNo(n, n/2, 0));
    // boolean result = isPerfectNo(n, n/2, 0);
    // System.out.println(result);
  }
  public static boolean isPerfectNo(int n,int i, int sum){
    if(i==0) return n ==sum;
    if(n%i==0) sum = sum+i;
    return isPerfectNo(n, i-1, sum);
  }
}