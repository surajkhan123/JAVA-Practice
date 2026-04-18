import java.util.Scanner;

public class NumOfCurrency {
  public static void main(String[] args) {
    System.out.println("Enter amount: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if(a>=2000){
      System.out.println("2000 X "+(a/2000));
      a = a%2000;
    }
    if(a>=500){
      System.out.println("500 X "+(a/500));
      a = a%500;
    }
    if(a>=200){
      System.out.println("200 X "+(a/200));
      a = a%200;
    }
    if (a>=100){
      System.out.println("100 X "+(a/100));
      a = a%100;
    }
     if(a>=50){
      System.out.println("50 X "+(a/50));
      a = a%50;
    }
     if(a>=10){
      System.out.println("10 X "+(a/10));
      a = a%10;
    }
  }
}
