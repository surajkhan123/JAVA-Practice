package Numbers.ArmStrong;

import java.util.Scanner;

public class C {
  // recursion for power
  static int power(int base,int exp){
    if(exp==0) return 1;

    return base * power(base, exp -1);
  }
  // recursion for sum
  static int sum(int n, int count){
    if(n==0) return 0;

    int d = n% 10;
    return power(d,count) + sum(n/10, count);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number: ");
    int n = sc.nextInt();

    int temp = n;
    int count = 0;

    // count digit 
    while(temp>0){
      count++;
      temp = temp /10;
    }
    int result = sum(n,count);
    if(result == n)
      System.out.println("Armstrong Number");
    else
      System.out.println("Not Armstrong Number");

    sc.close();
  }
}
