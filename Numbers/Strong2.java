import java.util.Scanner;

public class Strong2   {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n = sc.nextInt();
    int temp = n;
    
    int sum = 0;
    while(temp>0){
      int digit = temp % 10;
      int fact =1;
      for(int i=1;i<=digit;i++){
      
      fact = fact *i;
    } 
    sum = sum + fact;
    temp = temp /10;
    }
    if(sum == n){
    System.out.println("Strong number");
    } else {
      System.out.println("Not strong number");
    }
  }
}
