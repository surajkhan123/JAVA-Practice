// public package IfElse;

import java.util.Scanner;
class C {
  public static void main(String[] args) {
    System.out.println("Enter Number:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a>b){
      System.out.println(a+" is larger..");
    } else if(b>a){
      System.out.println(b +" is larger..");
    } else{
      System.out.println(c+" is larger..");
    }
  }
}