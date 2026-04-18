import java.util.Scanner;

public class LeapYear2 {
  public static void main(String[] args) {
    
    System.out.println("Enter a Year: ");
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();

    if((y%400 ==0) || (y%4==0 && y%100 !=0)){
      System.out.println(y+" is a Leap Year");
    } else {
      System.out.println(y+ " is not a Leap Year");
    }
  }
  
}
