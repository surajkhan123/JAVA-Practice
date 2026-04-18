import java.util.Scanner;

public class PerfectNum3 {
  public static void main(String[] args) {
    System.out.println("Enter Range: ");
    Scanner sc = new Scanner(System.in);
    int st = sc.nextInt();
    int end = sc.nextInt();
    // int st = 1;
    // int end = 10000;

    

    for(int n=st;n<=end;n++){
      int sum =0;
      for(int i=1;i<=n/2;i++){

        if(n%i==0){
          sum =sum+i;
        }
      }
       if(sum==n){
          System.out.println("Perfect Nums are: "+n);
        }
    }
  }
}
