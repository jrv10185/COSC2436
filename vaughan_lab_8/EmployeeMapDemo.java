public class EmployeeMapDemo {
    public static void main(String args[]){
        EmployeeMap emap = new EmployeeMap();

        Employee employees[] =
        {
            new Employee(1, "James Vaughan"),
            new Employee(2, "Tish Vaughan"),
            new Employee(3, "Meeko Vaughan"),
            new Employee(4, "Moki Vaughan"),
            new Employee(5,"Chris Vaughan"),
            new Employee(6, "Jon Snow")
        };
        for(int i = 0; i < employees.length; i++){
            emap.add(employees[i]);
        }

        searchEmployee(emap,1);
        searchEmployee(emap,2);
        searchEmployee(emap,3);
        searchEmployee(emap,4);
        searchEmployee(emap,5);
        searchEmployee(emap,6);

        searchEmployee(emap, 999);
    }

    public static void searchEmployee(EmployeeMap emap, Integer id){
        Employee e = emap.get(id);

        if(e != null){
            System.out.println(e);
        }else{
            System.out.println(id + " is not found in the map.");
        }
    }
}
