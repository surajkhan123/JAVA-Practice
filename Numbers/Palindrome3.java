package Numbers;

import java.util.Scanner;

public class Palindrome3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter starting range");
    int n1 = sc.nextInt();
    System.out.println("Enter ending range");
    int n2= sc.nextInt();

    int count =0;
    
    for(int i=n1;i<=n2;i++){
      int temp = i;
      int rev =0;
      while(temp>0){
      rev = rev*10+ temp%10;
      temp= temp/10;
      }
      if(rev == i){
      System.out.println(rev);
      count++;
      }

    } 
    System.out.println("Total Palindrome no is: "+count);
  }
}
