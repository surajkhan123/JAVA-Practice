import java.util.Scanner;

import Bus.Reservation;

class Bus{
    private static Bus  n;
    private int totalSeat;
    private Bus(){
      totalSeat = 50;
    } 
    public static Bus getObject(){
      if(n==null) n = new Bus();
      return n;
    }
    public void seatBooking(int seat){
      System.out.println("Total Seats are: "+totalSeat);
      if(seat > totalSeat) System.out.println("Seats are not available");
      else {
        totalSeat -= seat;
        System.out.println(seat+" are booked for you");
        System.out.println(totalSeat+" total seats are available");
      }
    }
    static class Reservation{
      public void reserveSeats(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many seats need for book");
        int noOfSeats = sc.nextInt();

        Bus b = Bus.getObject();
        b.seatBooking(noOfSeats);
      }
    }
  }

public class BusTicket {
  public static void main(String[] args) {
    Bus.Reservation p1 = new Bus.Reservation();
    p1.reserveSeats();
    Bus.Reservation p2 = new Bus.Reservation();
    p2.reserveSeats();
  }
}



// import java.util.Scanner;

// class Bus {
//   private static Bus n;//to set SingleToneClass
//   private int totalSeat;

//   private Bus(){
//     totalSeat = 50;
//   }
//   public static Bus getObject()//to access private constructer
//   {
//     if(n== null) n = new Bus();
//     return n;
//   }
//   public void setBooking(int seats){
//     System.out.println("Total Seats are: "+totalSeat);
//     if(seats>totalSeat) System.out.println("Sits are not available");
//     else{
//       totalSeat -=seats;
//       System.out.println(seats+" are booked for you");
//       System.out.println(totalSeat+" are available");
//     }
//   }

//  static class Reservation
//   {
//     public void reserveSeats()
//     {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("How many Seats do you need: ");
//       int noOfSeats = sc.nextInt();

//       // bus Object
//       Bus b = Bus.getObject();
//       b.setBooking(noOfSeats);
//     }
//   }
// }

// public class BusTicket {
//   public static void main(String[] args) {
//     //Bus bus = Bus.getObject();
//     Bus.Reservation person1 = new Bus.Reservation();
//     person1.reserveSeats();
//     Bus.Reservation person2 = new Bus.Reservation();
//     person2.reserveSeats();
  
    
//   }

  
// }
