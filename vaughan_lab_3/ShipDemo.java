public class ShipDemo{
    public static void main(String[] args){
        Ship[] arr = new Ship[3];
        

        arr[0] = new Ship("Titanic","1882");
        arr[1] = new CruiseShip("Explorer of the Seas", "2023", 2000);
        arr[2] = new CargoShip("Big Bubba", "2000", 1000);

        for (Ship obj : arr){
            System.out.println(obj.toString());
        }
    }
}