package PatternsFinal;

public class ZigZagNumber2 {
  public static void main(String[] args) {
    int n =5;
    int num =1;

    for(int i=1;i<=n;i++){
      int start = num;
      int[] arr = new int[i];
      for(int j=0;j<i;j++){
        arr[j] = num;
        num++;
      }

      if(i%2==0){
        for(int j=i-1;j>=0;j--)
          System.out.print(arr[j]+" ");
      } else {
        for(int j=0;j<i;j++)
          System.out.print(arr[j]+" ");
      }
      System.out.println();
    }
  }
}
