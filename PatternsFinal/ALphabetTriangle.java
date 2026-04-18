package PatternsFinal;


public class ALphabetTriangle {
  public static void main(String[] args) {
    int n =5;
    char ch ='A';

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(ch+" ");

        // A 
        // A A 
        // A A A 
        // A A A A 
        // A A A A A 
        ch++;
        // A 
        // B C 
        // D E F 
        // G H I J 
        // K L M N O 
      } System.out.println();
    }
  }
}
