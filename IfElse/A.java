// package IfElse;
import java.util.*;

public class A {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int n = s.nextInt();

    // if(n%2==0)
      if((n&1)==0)  // without % , showing bitwise
      {
      System.out.println("Even Number...");

    } else {
      System.out.println("Odd Number...");
    }

    
  }
}
