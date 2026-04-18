import java.util.Scanner;

public class Prime1 {
  public static void main(String[] args) {
    System.out.println("Enter Number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flag = true;

    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        flag = false;
        break;
      }
    }
    if(n>=2 && flag){
      System.out.println("Prime");
    } else System.out.println("Not Prime");
  }
  
}
