package MethodOverloading;

import java.util.Scanner;

public class PrintRandomNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name: ");
    String name = sc.nextLine();

    int r = (int)(Math.random()*9)+1;
    int score = 0;
    for(int i=1;i<=3;i++){
      System.out.println("Guess a Num bt (1-9)");
      int n = sc.nextInt();

      if(r==n){
        score += 10;
        r = (int)(Math.random()*9)+1;
        if(r>n) System.out.println("choose large num"); else System.out.println("choose small num");
      } if(r>n) {System.out.println("choose large num");} else {System.out.println("choose small num");}
    } System.out.println("Your score is: "+score);
    
  }
}
