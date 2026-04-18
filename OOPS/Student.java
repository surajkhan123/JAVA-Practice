package OOPS;

public class Student {
  String name;
  int age;
  int id;
  static String Stream;
  
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Suraj";
    s1.age = 24;
    s1.id = 101;
    s1.Stream = "Kolkata"; //এটা static variable। মানে:

// 👉 সব object এর জন্য একটাই common value থাকবে

    Student s2 = new Student();
    s2.name = "Sohel";
    s2.age = 20;
    s2.id = 102;
  

    System.out.println(s1.name+"\t"+s1.age+"\t"+s1.id+"\t"+s1.Stream);
    System.out.println(s2.name+"\t"+s2.age+"\t"+s2.id+"\t"+s2.Stream);
    
  }
}
