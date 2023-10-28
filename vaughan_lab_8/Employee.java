public class Employee {
    private int id;
    private String name;

    /**
     * Constructor
     * 
     * @param idNumber the Employee's ID number
     * @param empName  The employee's name
     */

     public Employee(int idNumber, String empName){
        id = idNumber;
        name = empName;
     }

     /**
      * getIdNumber method
      * @return The Employee's ID number.
      */

      public int getIdNumber() {return id;}

      /**
       * getName methos 
       * @return the employee's name
       */

       public String getName() {return name;}

       public String toString() {
        return "ID Number: "+id+" Name: "+name;
       }

}