import java.util.Random;

public class RandomNum1 {
  public static void main(String[] args) {
    
    int number;
    Random random = new Random();
    number = random.nextInt(9);
    System.out.println("Generated Number is: "+number);
  }
}
