package vaughan_lab_1;

public class Employee{

    /**
     * Declare needed private variables
     */

    private String name;
    private int idNumber;
    private String department;
    private String position;

    /**
      Constructor
      @param n The employee name.
      @param id The employee ID.
      @param dept The Employee department.
      @param pos The employee position.
   */

   public Employee(String n,int id,String dept,String pos){
        name = n;
        idNumber = id;
        department = dept;
        position = pos;
   }

   /**
      Constructor
      @param n The employee name.
      @param id The employee ID.
   */

   public Employee(String n,int id){
        name = n;
        idNumber = id;
   }

   /**
      Default Constructor
   */

   public Employee(){
   }

   /**
      The setName method stores a value in the
      name field.
      @param n The value to store in name.
   */

   public void setName(String n)
   {
      name = n;
   }

   /**
      The setIdNumber method stores a value in the
      idNumber field.
      @param n The value to store in idNumber.
   */

   public void setIdNumber(int id)
   {
      idNumber = id;
   }

   /**
      The setDepartment method stores a value in the
      department field.
      @param n The value to store in setDepartment.
   */

   public void setDepartment(String dept)
   {
      department = dept;
   }

   /**
      The setPosition method stores a value in the
      position field.
      @param n The value to store in setPosition.
   */

   public void setPosition(String pos)
   {
      position = pos;
   }

   /**
      The getName method returns a employee's name.
      @return The value in the name field.
   */

   public String getName()
   {
      return name;
   }

   /**
      The getIdNumber method returns a employee's id number.
      @return The value in the idNumber field.
   */

   public int getIdNumber()
   {
      return idNumber;
   }

   /**
      The getDepartment method returns a employee's department.
      @return The value in the department field.
   */

   public String getDepartment()
   {
      return department;
   }

   /**
      The getPosition method returns a employee's position in the department.
      @return The value in the position field.
   */

   public String getPosition()
   {
      return position;
   }

}