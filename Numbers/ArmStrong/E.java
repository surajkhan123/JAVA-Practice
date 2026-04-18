package Numbers.ArmStrong;

import java.util.Scanner;

public class E {
  //recursion function 
  static int sum(int n){
    if(n==0) return 0;

    int d = n%10;
    return (d*d*d) + sum(n/10);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number");
    int n = sc.nextInt();

    int result = sum(n);

    if(result == n){
      System.out.println("Armstrong Number");
    } else
    {
      System.out.println("Not Armstrong number");
    }
    
  }
}
