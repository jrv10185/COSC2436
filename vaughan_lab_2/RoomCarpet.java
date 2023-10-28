/**
   This class stores data about a Room's carpet.
*/

public class RoomCarpet 
{
   private Double costPerSqFt;      // Cost per square ft
   private RoomDimension room;  // The room

   /**
      This constructor initializes the courseName,
      instructor, and text fields.
      @param costPerSqFt The cost per square foot.
      @param room An room object.
   */

   public RoomCarpet(Double c, RoomDimension obj)
   {
      // Assign the cost per square foot.
      costPerSqFt = c;

      // Create a new RoomDimension object, passing
      // room as an argument to the copy constructor.
      room = new RoomDimension(obj);
   }
   // copy constructor
   public RoomCarpet(RoomCarpet obj)
   {
      costPerSqFt = obj.costPerSqFt;
      room = obj.room;

   }

   public Object clone()
   {
      return  new RoomCarpet(this);
   }
   public void finalize()
   {
      System.out.println("RoomCarpet object has been destroyed");
   }

   public int hashCode()
   {
      // Using Joshua Bloch's recipe for hashCode

      int result = 17;

      result = 37 * result + (int)Math.floor(costPerSqFt);
   
      return result;

   }
   public  boolean equals(RoomCarpet obj)
   {
      boolean status;
      if (costPerSqFt == (obj.costPerSqFt))
         status = true;
      else
         status =false;

      return status;
   }

   public int compareTo(Object obj)
   {
      int result = 0;
      RoomCarpet c = (RoomCarpet) obj;
      if (costPerSqFt == (c.costPerSqFt))
         result = 0;
      else if (costPerSqFt > (c.costPerSqFt))
         result = -1;
      else
         result = 1;

      return result;
   }

   /**
      getFinalCost method
     @return The final cost of the carpet.
   */

   public Double getFinalCost()
   {
     double finalCost = costPerSqFt * room.getArea(); 
     return finalCost;
   }

   /**
      getInstructor method
      @return A reference to a copy of this course's
              Instructor object.
   */

   public RoomDimension getRoomDimension()
   {
      // Return a copy of the instructor object.
      return new RoomDimension(room);
   }

   /**
    * set cost per square foot
    */

    public void setCost(Double c){
        costPerSqFt = c;
    }

   /**
      toString method
      @return A string containing the course information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "RoomCarpet cost per square foot: " + costPerSqFt +
                   "\nRoom Dimensions:\n" +
                   room;
      return str;
   }
}