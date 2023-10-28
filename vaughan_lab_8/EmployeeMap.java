import java.util.Map;
import java.util.HashMap;

public class EmployeeMap {
    private Map<Integer, Employee> empMap;
    /**
     * Constructor
     */

     public EmployeeMap(){
        empMap = new HashMap<Integer, Employee>();
     }
    
     /**
      * The add method creates a mapping in the map. 
      * An employee ID number is mapped to an Employee object.
      * @param e The employee object to create the mapping with.
      */
     public void add(Employee e) {
        empMap.put(e.getIdNumber(), e);
     }

     /**
      * The get method retrieves the Employee object that is associated with a specific ID number.
      * @param idNumber An employee ID number.
      * @preturn The Employee object associated with the specified ID number. Returns null if no mapping exists for the ID number.
      */
    public Employee get(Integer idNumber){
        return empMap.get(idNumber);
    }
}
