package MethodRecursion;

import java.util.Scanner;

public class ArmstrongNum1 {

    static int countDigits(int n){
      if(n==0)
        return 0;

      return 1+countDigits(n/10);
    }
    static int sumPower(int n,int digits){
    if(n==0)
      return 0;
    int last = n%10;
    return(int)Math.pow(last, digits)+ sumPower(n/10,digits);
  }
  static boolean isArmStrong(int n){
    int digits = countDigits(n);
    int sum = sumPower(n, digits);
    return sum ==n;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Num:");
    int n = sc.nextInt();
    if(isArmStrong(n))
      System.out.println("Armstrong Num");
    else System.out.println("Not Armstrong Num");

    sc.close();
    
  }
}
