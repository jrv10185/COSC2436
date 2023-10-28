/**
   This class stores data about a Room's dimensions.
*/

public class RoomDimension 
{
   private int length;      // Length of room
   private int width;  // width of room

   /**
      This constructor initializes the length and width
      @param length The length of the room.
      @param width The width of the room. 
   */

   public RoomDimension(int len, int w)
   {
      length = len;
      width = w;
   }

   /**
      The copy constructor initializes the object
      as a copy of another Instructor object.
      @param object2 The object to copy.
   */
   
   public RoomDimension(RoomDimension object2)
   {
      length = object2.length;
      width = object2.width;
   }

   public Object clone()
   {
      return  new RoomDimension(this);
   }
   public void finalize()
   {
      System.out.println("RoomDimension object has been destroyed");
   }

   public int hashCode()
   {
      // Using Joshua Bloch's recipe for hashCode

      int result = 17;

      result = 37 * result + length;
      result = 37 * result + width;
      return result;
    }

    public  boolean equals(RoomDimension obj)
   {
      boolean status;
      if (length ==(obj.length) && width ==(obj.width))
         status = true;
      else
         status =false;

      return status;
   }

   public int compareTo(Object obj)
   {
      int result = 0;
      RoomDimension i = (RoomDimension)obj;
      if (length ==(i.length) && width == (i.width))
         result = 0;
      else if (length == (i.length) && width > (i.width))
         result = -1;
      else
         result = 1;

      return result;
   }

   /**
      The set method sets a value for each field.
      @param length The length of the room.
      @param width The width of the room. 
   */
   
   public void set(int len, int w)
   {
      length = len;
      width = w;
   }

    /**
      toString method
      @return A string containing the instructor
              information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Length: " + length +
                   "\nWidth: " + width;
      // Return the string.
      return str;
   }

   public int getArea()
   {
    int area = length * width;
    return area;
   }
}