// package Numbers;

class BinaryToDec1 {

  public static void main(String[] args) {
    int n = 101;
    int t = n;
    int i =0;
    int d = 0;

    while(t>0){
      int r = t%10;
      t = t/10;
      d = d+ r* (int) Math.pow(2, i++);
    } System.out.println(d);
    
  }
}


