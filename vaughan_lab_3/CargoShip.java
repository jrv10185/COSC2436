public class CargoShip extends Ship{
    private int cargoCapacity;

    public CargoShip(String name, String year, int cap){
        super(name, year);
        cargoCapacity = cap;
    }

    public void setCap(int n){
        cargoCapacity = n;
    }

    public int getCap(){
        return cargoCapacity;
    }

    public String toString(){
        String str ="Cargo Ship Information: \nCargo Capacity "+getCap()+"\n"+super.toString();;
        return str;
    }

    @Override
   public void display() {
      System.out.println("display from CargoShip.");
   }

}
