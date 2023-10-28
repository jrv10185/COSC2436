/**
 * The Ship Class contains information for both the CruiseShip Class and the CargoShip class
 */

 public class Ship implements Displayable {
    
    private String shipName;
    private String yearBuilt;

    public Ship(String name, String year){
        shipName = name;
        yearBuilt = year;
    }

    public void setName(String n){
        shipName = n;
    }

    public void setYear(String y){
        yearBuilt = y;
    }

    public String getName(){
        return shipName;
    }

    public String getYear(){
        return yearBuilt;
    }

    public String toString(){
        String str = "The ship's name is "+getName()+"\nThe year it was built is "+getYear();
        return str;
    }

    @Override
   public void display() {
      System.out.println("display from Ship.");
   }
 }