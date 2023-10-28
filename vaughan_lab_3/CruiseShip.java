public class CruiseShip extends Ship{
    private int maxPass;

    public CruiseShip(String name, String year, int pass){
        super(name, year);
        maxPass = pass;
    }

    public void setPass(int n){
        maxPass = n;
    }

    public int getPass(){
        return maxPass;
    }

    public String toString(){
        String str ="Cruise Ship Information: \nMax Passengers: "+getPass()+"\n"+super.toString();
        return str;
    }

    @Override
   public void display() {
      System.out.println("display from CruiseShip.");
   }

}
