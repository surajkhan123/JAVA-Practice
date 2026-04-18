// package Encapsulation;

//  class Student{
//     private String name;
//     private int id;

//     public void setId(int id){
//       this.id = id;
//     }
//     public int getId(){
//       return id;

//     }
//     public void setName(String name){
//       this.name = name;
//     }
//     public String getName(){
//       return name;
//     }
//   }

//   public class StudentTest {
 

//   public static void main(String[] args) {
//     Student s1 = new Student();
//     s1.setId(1);
//     System.out.println("Student id: "+s1.getId());
//     s1.setName("Suraj");
//     System.out.println("Student name: "+s1.getName());

    
//   }
  
// }


package Encapsulation;

class Student{
    private int id;
    private String name;

    public void setId(int id){
      this.id = id;
    }
    public int getId(){
      return id;
    }
    public void setName(String name){
      this.name = name;
    }
    public String getyName(){
      return name;
    }

  }

public class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setId(1); System.out.println("Student id: "+s1.getId());
    s1.setName("Suraj"); System.out.println("Student name: "+s1.getyName());
  }

  
}