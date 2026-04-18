package MethodRecursion;

import java.util.Scanner;

public class ArmstrongNum2 {
  public static int isArm(int n){
    if(n<10)
      return n*n*n;
    return (n%10)*(n%10)*(n%10)+isArm(n/10);

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number:");
    int n = sc.nextInt();
    int num;

    num = isArm(n);
    if(num==n) System.out.println("Armstrong");
    else System.out.println("Not Armstrong");
    sc.close();
  }
}
