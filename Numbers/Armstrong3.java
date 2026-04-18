  import java.util.Scanner;

public class Armstrong3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Starting Range:");
    int n1 = sc.nextInt();
    System.out.println("Enter Ending Range:");
    int n2 = sc.nextInt();
    
    // only for 3 digits

    for(int n=n1;n<=n2;n++){
      int m =n;
      int sum =0;
      while(m>0){
      int d = m%10; sum = sum + (int)Math.pow(d, 3);  //or  sum = sum +(m%10)*(m%10)*(m%10);
      m = m/10;
    } if(sum==n){
    System.out.println(n);
    }
    }
    
  }
}

