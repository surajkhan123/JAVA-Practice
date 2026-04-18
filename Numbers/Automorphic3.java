package Numbers;

import java.util.Scanner;

public class Automorphic3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Num: ");
    int n = sc.nextInt();
    int t =n;
    int sq = n*n;
    int l=0;

    while(t>0){
      t = t/10;
      l++; 
    } 
    int end = sq % (int)Math.pow(10, l);
    if(end == n){
      System.out.println("Automorphic Num");
    } else {
      System.out.println("Not Automorphic Num");
    }
  }
}
