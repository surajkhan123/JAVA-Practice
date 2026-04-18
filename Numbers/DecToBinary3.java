package Numbers;

import java.util.Scanner;
// String operation for decimal to binary
public class DecToBinary3 {
  public static void main(String[] args) {
    System.out.println("Enter a Number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int temp = n;
    String s = "";

    while(temp>0){
      int r = temp%2;
      temp = temp /2;
      s = r + s;


    } System.out.println(s);
  }
}
