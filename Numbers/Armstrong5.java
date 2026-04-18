package Numbers;

import java.util.Scanner;

public class Armstrong5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number To check: ");
    int n = sc.nextInt();
    int m = n;

    int sum = 0;
    while(n>0){
      int d = n%10;
      sum = sum + (int)Math.pow(d,3);
      n=n/10;
    } if(sum==m){
      System.out.println(m+" is Armstrong Num");
    } else {
      System.out.println(m+" is Not Armstrong Num");
    }
  }
}
