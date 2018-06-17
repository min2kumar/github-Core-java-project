package daopattern;

public class DAOpattern 
{
    public static void main(String[] args) 
    {
        EmployeeDAO obj = new EmployeeDAOCollectionImpl();
        
        obj.getAllEmployees();
        
        obj.addEmployee(new Employee(3,"Ajay",15000,"IT"));
        obj.addEmployee(new Employee(4,"Sandeep",15000,"IT"));
        obj.addEmployee(new Employee(5,"Chandan",15000,"IT"));
        
        obj.getAllEmployees();
        
        obj.removeEmployee(new Employee(3,"Ajay",15000,"IT"));
        
        obj.getAllEmployees();
        
        obj.updateEmployee(new Employee(1,"Mintu",25000,"Finance"));
        
        obj.getAllEmployees();
    }
}
