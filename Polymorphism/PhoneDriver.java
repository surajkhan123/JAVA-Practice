package Polymorphism;
// Run Time  Polymorphism

@FunctionalInterface
interface Sim{
  void connect();
}
class Phone{
  Sim s;
  public Phone(Sim s){
    this.s = s;
  }
  public void Call(){
    s.connect();
  }
}

class Airtel implements Sim{
  @Override
  public void connect(){
    System.out.println("Call connected to Airtel");
  }
}

class VI implements Sim{
  @Override
  public void connect(){
    System.out.println("Call connected to VI");
  }
}

class Jio implements Sim{
  @Override
  public void connect(){
    System.out.println("Call connected to Jio");
  }
}

public class PhoneDriver {
  public static void main(String[] args) {
    Phone p = new Phone(new VI());
    p.Call();
  }
  
}
