public class Mobilee {
  String name;
  String ram;
  String rom;
  String color;

  Mobilee(String name,String ram,String rom,String color){
    this.name=name;
    this.ram = ram;
    this.rom = rom;
    this.color = color;
  }
  @Override
  public String toString(){
    return name+" "+ram+" "+rom+" "+color+" ";
  }
  @Override
  public boolean equals(Object obj){
    Mobilee m = (Mobilee) obj;

    if(name.equals(m.name)&& ram.equals(m.ram)&& rom.equals(m.rom)&& color.equals(m.color)){
      return true;
    }
    else{
      return false;
    }

  }
  public static void main(String[] args) {
    Mobilee m1 = new Mobilee("Oppo", "4GB","128GB","Blue");
    Mobilee m2 = new Mobilee("Oppo", "4GB", "128GB", "Blue");

    System.out.println(m1);

    if(m1.equals(m2)){
      System.out.println("Mobiles are equal");
    } else{
      System.out.println("Mobiles are not equal");
    }
    
  }
  
}
