package Numbers;

import java.util.Scanner;

public class Palindrome2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
    int org_num = n; 
    int rev =0;

    while(n>0){
      rev = rev*10 + n%10;
      n = n/10;

    } if(rev == org_num){
      System.out.println("Palindrome Num");
    } else {
      System.out.println("Not Palindrome Num");
    }


  }
}
