package Numbers;

public class Palindrome1 {
  public static void main(String[] args) {
    int n =121;
    int m =n;
    int rev = 0;
    while(n>0){
      rev = (rev*10) + (n%10);
      n =n/10;
      // System.out.println(rev);
    } if(rev==m) System.out.println("Palindrome Num");
    else System.out.println("Not Palindrome Num");
  }
}
