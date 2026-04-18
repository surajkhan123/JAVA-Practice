package Numbers.ArmStrong;

import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter starting range:");
    int st = sc.nextInt();
    System.out.println("Enter ending range:");
    int end = sc.nextInt();
    // int n =153;
    for(int n=st;n<=end;n++)
    {
      int m =n; int temp = n; int sum =0;
    int count = 0;
    while(temp>0){
      
      temp = temp/10;
      count++;
    }
    // System.out.println("Count = "+count);

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
    // System.out.println("Sum ="+sum);
    if(sum == m){
      System.out.println("Armstrong Number is: "+n);
    }
    // else {
    //   System.out.println("Not armstrong Number");
    // }

    }
    sc.close();
    
  }
}