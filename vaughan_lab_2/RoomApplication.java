/**
   This program demonstrates the Room class.
*/
import java.util.ArrayList;
//import java.util.Iterator;

public class RoomApplication
{
   public static void main(String[] args)
   {
      // Create three RoomDimension objects.
      RoomDimension roomDimension = new RoomDimension(10, 10);
      RoomDimension roomDimension2 = new RoomDimension(11, 11);
      RoomDimension roomDimension3 = new RoomDimension(10, 11);
             
      // Create three Course object.
      RoomCarpet room1 =  new RoomCarpet(10.00, roomDimension);
      RoomCarpet room2 = new RoomCarpet(10.50, roomDimension2);
      RoomCarpet room3 = new RoomCarpet(11.00, roomDimension3);

      // create otherCourse using copy constructor (testing copy constructor)
      RoomCarpet otherRoom = new RoomCarpet(room1);
      // create courseCloned using clone method (testing clone() method)
      RoomCarpet roomCloned = (RoomCarpet)room2.clone();

      // Display the course information with hashcode (testing toString() and hashCode() methods)
      System.out.println("my room");
      System.out.println("Hash code: " + room1.hashCode());
      System.out.println(room1);
      System.out.println("my room 2");
      System.out.println("Hash code: " +room2.hashCode());
      System.out.println(room2);
      System.out.println("my room 3");
      System.out.println("Hash code: " +room3.hashCode());
      System.out.println(room3);
      System.out.println("other room");
      System.out.println("Hash code: " +otherRoom.hashCode());
      System.out.println(otherRoom);
      System.out.println("cloned room");
      System.out.println("Hash code: " +roomCloned.hashCode());
      System.out.println(roomCloned);

      // testing equals method
      if (room1.equals(otherRoom))
         System.out.println("myCourse is equal to otherCourse");
      if (room2.equals(roomCloned))
         System.out.println("myCourse 2 is equal to cloned Course");

      // testing compareTo method
      if (room1.compareTo(room2) == 0)
         System.out.println("same course");
      else if (room1.compareTo(room2) < 0)
         System.out.println("listed before");
      else
         System.out.println("listed after");

      // testing compareTo method
      if (room2.compareTo(room3) == 0)
         System.out.println("same course");
      else if (room2.compareTo(room3) < 0)
         System.out.println("listed before");
      else
         System.out.println("listed after");

      // using ArrayList to populate course objects
      ArrayList<RoomCarpet> roomList = new ArrayList<>();
      roomList.add(room1);
      roomList.add(room2);
      roomList.add(room3);
      System.out.println(roomList.get(0).getFinalCost());
      }
   }