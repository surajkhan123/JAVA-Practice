package MethodRecursion;

public class MripNum1 {
  public static void main(String[] args) {
    System.out.println(Mrip(13));   // UPDATED: example check
  }

  public static boolean Mrip(int i){
    int d = i;          // UPDATED: original number save
    int sum = 0;

    while(i>0){
      sum = sum *10 + i%10;
      i = i/10;
    }

    return Prime(d,sum);   // UPDATED: send original number
  }

  public static boolean Prime(int i,int sum){

    // UPDATED: prime check for i
    if(i < 2) return false;
    for(int j=2;j<=Math.sqrt(i);j++){
      if(i % j == 0)
        return false;
    }

    // UPDATED: prime check for reversed number
    if(sum < 2) return false;
    for(int j=2;j<=Math.sqrt(sum);j++){
      if(sum % j == 0)
        return false;
    }

    // UPDATED: Emirp condition (not palindrome)
    if(i == sum)
      return false;

    return true;   // UPDATED
  }
}