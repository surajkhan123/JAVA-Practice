package PatternsFinal;

public class Num {

  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++){
      int st = n-i+1;
      for(int j=st;j>=1;j--){
        System.out.print(j+" ");
        if(j!=1) System.out.print("* ");
      }System.out.println();
    } 
  }
}