package daopattern;

import java.util.List;


public interface EmployeeDAO 
{
    //persistence logic
    //methods = public + abstract
    //variables = public + static + final
    void addEmployee(Employee e);
    void updateEmployee(Employee e);
    void removeEmployee(Employee e);
    Employee findEmployeeById(int id);
    void getAllEmployees();
}
