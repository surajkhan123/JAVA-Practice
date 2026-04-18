import java.util.Scanner;

public class Armstrong2 {
  public static void main(String[] args){
    System.out.println("Enter a Number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    int m =n;

    while(n>0){
      sum = sum +(n%10)*(n%10)*(n%10);
      n = n/10;
    } if(sum==m){
      System.out.println("Armstrong");
    } else {
      System.out.println("Not Armstrong");
    }
  }
}
