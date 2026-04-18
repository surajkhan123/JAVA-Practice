public class PrimePalindrome1{
  // using Method Recursion
  public static void main(String[] args) {
    System.out.println("1");
    range(1,100);
  }
  public static void range(int st,int end){

    if(st>end) return ;

    if(isPrimePalindrome(st))
      System.out.println(st);

    range(st+1,end);

  }
  public static boolean isPrimePalindrome(int n){

    int d = n;
    int sum =0;
    //checking Prime 
    if (d<2) return false;
    for(int i=2;i<=Math.sqrt(d);i++){
      if(d%i==0) return false;
    }
    //Palindrome check
    while(d>0){
      sum = sum*10 + d%10;
      d = d/10;
    }
    if(sum == n)
      return true;
    else
      return false;


  }
}