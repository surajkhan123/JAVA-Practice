// package IfElse;

import java.util.Scanner;

public class B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number: ");
  int n = sc.nextInt();
  
  // if((n&1)==0) // bitwise checking
  if(n%2==0)
{
    System.out.println("Even Number..");
  } else{
    System.out.println("Odd Number...");
  }
    
  }
  

}
