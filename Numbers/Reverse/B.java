package Numbers.Reverse;

public class B {
  public static void main(String[] args) {

    int st = 1, end = 500;
    for(int i=st;i<=end;i++){

    // .. Print Palindrome Number
    int n = i;
    int temp = n;

    int rev = 0;
    while(n>0){
      rev = rev*10 + n%10;
      n /=10;
    }
    if(rev == temp) System.out.println(i);
  }
  }
}
