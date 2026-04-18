package Numbers;

import java.util.Scanner;

public class Spy1 {
  public static void main(String[] args) {
    System.out.println("Enter Number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int rev = 0;
    int sum =0;
    int product =1;

    while(n>0){
      rev = n%10;
      sum = sum +rev;
      product = product * rev;
      n = n/10;

      
    } if(product == sum){
      System.out.println("Spy Num");
    } else {
      System.out.println("Not a Spy Num");
    }
  }
}
