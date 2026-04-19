package PatternsFinal;

public class NumberLeftTriangle { // Left Aligned
  public static void main(String[] args) {
    int n = 5;

    // 5 
    // 4 5 
    // 3 4 5 
    // 2 3 4 5 
    // 1 2 3 4 5 
    for(int i=n;i>=1 ;i--){
      for(int j=i;j<=n; j++){
        System.out.print(j+" ");
      } System.out.println();
    }
  }
}
