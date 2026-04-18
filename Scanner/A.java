// package Scanner;

import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    System.out.println("Enter Two Number: ");
    int a =s.nextInt();
    int b = s.nextInt();
    System.out.println(a + " + " + b + " = " + (a + b));
    s.close();

  }
}
