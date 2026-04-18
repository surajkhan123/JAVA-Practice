public class Mobile {
  String name;
  String ram;
  String rom;
  String color;

  Mobile(String name,String ram,String rom,String color){
    this.name = name;
    this.ram = ram;
    this.rom = rom;
    this.color = color;
  }
  @Override
  public String toString()
  {
    return name+" "+ram+" "+rom+" "+color+" ";
  }
  @Override
  public boolean equals(Object obj){
    Mobile m = (Mobile)obj;

    if(name.equals(m.name) && ram.equals(m.ram) && rom.equals(m.rom) && color.equals(m.color)){
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Mobile m1 = new Mobile("Oppo","8GB", "128GB", "Blue");
    Mobile m2 = new Mobile("Oppo","8GB", "128GB", "Blue");

    System.out.println(m1);

    if(m1.equals(m2))
      System.out.println("Mobiles are Equal");
    else System.out.println("Mobiles are not Equal");
  }
}
