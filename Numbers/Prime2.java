import java.util.Scanner;

public class Prime2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Start Number:");
    int n1 = sc.nextInt();

    System.out.println("Enter End Number:");
    int n2 = sc.nextInt();

    for(int n = n1; n <= n2; n++) {

      if(n < 2) continue;   // skip 0 and 1

      boolean flag = true;  // reset for each number

      for(int i = 2; i <= n/2; i++) {
        if(n % i == 0) {
          flag = false;
          break;
        }
      }

      if(flag) {
        System.out.println(n);
      }
    }

    sc.close();
  }
}