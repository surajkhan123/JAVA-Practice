package PatternsFinal;

public class RightAlignedNumberTriangle {
  public static void main(String[] args) {

    // Right Aligned Number Triangle or
  // Number Pyramid (Left shifted)

  //         1 
  //       2 2 
  //     3 3 3 
  //   4 4 4 4 
  // 5 5 5 5 5 

  int n =5;

  for(int i=1;i<=n;i++){
    for(int s = 1;s<=n-i;s++){
      System.out.print("  ");
    }

    for(int j=1;j<=i;j++){
    System.out.print(i+" ");
    }
    System.out.println();    
  }
      
  }
}
