package Numbers;

import java.util.*;
public class Automorphic1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a NUmber");
    int n = sc.nextInt();

    int x = Math.abs(n);
    int mod = 1;
    int t = x;
    while (t > 0) { mod *= 10; t /= 10; }

    int sq = x * x;
    if (sq % mod == x) {
      System.out.println(n + " is automorphic");
    } else {
      System.out.println(n + " is NOT automorphic");
    }
    sc.close();
  }
  
}
