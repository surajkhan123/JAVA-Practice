package PatternsFinal;

public class NumberIncrease {
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i+" ");  
        // 1 
        // 2 2 
        // 3 3 3 
        // 4 4 4 4 
        // 5 5 5 5 5 
        
        // System.out.print(j+" ");
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 
      } System.out.println();
    }
  }
}
