package Numbers.ArmStrong;

import java.util.Scanner;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    int n = sc.nextInt();
    // int n =153;
    int m =n; int temp = n; int sum =0;
    int count = 0;
    while(temp>0){
      
      temp = temp/10;
      count++;
    }
    System.out.println("Count = "+count);

    temp = n;
    while(temp>0){
      int d = temp%10;
      int prod = 1;
      for(int i =1;i<=count;i++){
        prod = prod*d;
      }
      sum = sum +prod;
      temp = temp/10;
    }
    System.out.println("Sum ="+sum);
    if(sum == m){
      System.out.println("Armstrong Number");
    }
    else {
      System.out.println("Not armstrong Number");
    }
  }
}