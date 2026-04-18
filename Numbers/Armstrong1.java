import java.util.Scanner;
public class Armstrong1 {
  public static void main(String[] args){
    System.out.println("Enter a Number:");
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();

  
    int sum =0;
    int m =n;
    // int temp =n;

    int count = 0;
    while(n>0){
      count++;
      n=n/10;
    } System.out.println("Count= "+count);

  
    while(n >0){
      int d = m% 10;
      int prod =1;

      for(int i=1;i<=count;i++){
        prod = prod * d;
      } sum =sum +prod;
      n = n/10;
    } System.out.println("Sum = "+sum);
    if(sum==m){
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not armstrong Number");
    }
    sc.close();
  }
  
}


// import java.util.Scanner;

// public class Armstrong1 {
//   public static void main(String[] args){
//     System.out.println("Enter a number:");
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     int temp = n;   // store original number
//     int m = n;      // copy for final comparison

//     int count = 0;
//     while(temp > 0){
//       count++;
//       temp = temp / 10;
//     }

//     System.out.println("Count = " + count);

//     temp = n;   // reset temp again
//     int sum = 0;

//     while(temp > 0){
//       int d = temp % 10;   // correct digit extraction
//       int prod = 1;

//       for(int i = 1; i <= count; i++){
//         prod = prod * d;
//       }

//       sum = sum + prod;
//       temp = temp / 10;
//     }

//     System.out.println("Sum = " + sum);

//     if(sum == m){
//       System.out.println("Armstrong number");
//     } else {
//       System.out.println("Not Armstrong Number");
//     }

//     sc.close();
//   }
// }
