package PatternsFinal;

public class HollowDiamond {
  public static void main(String[] args) {
    int n = 5;

    //Top part
    for(int i=1; i<=n ;i++){
      //space
      for(int j=1;j<=n-i; j++){
       System.out.print(" ");
      }

      //stars
      int width = 2*i-1;
      for(int j=1; j<= width; j++){
        if(j==1 || j==width)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    //Bottom Part
    for(int i= n-1; i>=1 ;i--){
      for(int j=1 ; j<= n-i; j++){
        System.out.print(" ");
      }
      int width = 2*i -1;
      for(int j=1 ; j<= width;j++){
        if(j==1 || j ==width)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
