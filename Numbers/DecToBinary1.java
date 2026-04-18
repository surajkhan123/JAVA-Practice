package Numbers;

import java.util.Scanner;

public class DecToBinary1 {
  public static void main(String[] args) {
    System.out.println("Enter a Number");;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s =" ";

    while (n>0) {
      int bit = n%2;
      s = bit+s;
      n= n/2;
      
    } System.out.println(s);
  }
}
