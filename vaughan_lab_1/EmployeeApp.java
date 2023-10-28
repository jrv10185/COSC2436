package vaughan_lab_1;

public class EmployeeApp {
    public static void main(String[] args){
        //create 3 employee objects
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting","Vice President");
        Employee emp2 = new Employee("Mark Jones", 39119,"IT","Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing","Engineer");

        //display the results
        System.out.println("First Employee is "+emp1.getName()+", their ID number is "+emp1.getIdNumber()+", their Department is "+emp1.getDepartment()+", and their position is "+emp1.getPosition());
        System.out.println("First Employee is "+emp2.getName()+", their ID number is "+emp2.getIdNumber()+", their Department is "+emp2.getDepartment()+", and their position is "+emp2.getPosition());
        System.out.println("First Employee is "+emp3.getName()+", their ID number is "+emp3.getIdNumber()+", their Department is "+emp3.getDepartment()+", and their position is "+emp3.getPosition());
    }
}
