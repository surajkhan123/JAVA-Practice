package Numbers;
import java.util.Scanner;

public class Summesion1 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Num: ");
    int n = sc.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;          // add numbers from 1 to n
    }
    // System.out.println(sum);
    System.out.println("Summation of "+n+" = " + sum);
    sc.close();
  }
}
