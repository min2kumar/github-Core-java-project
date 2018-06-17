

package daopattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOCollectionImpl implements EmployeeDAO
{
    private List<Employee> empList;

    public EmployeeDAOCollectionImpl() 
    {
        empList = new ArrayList<>();
        empList.add(new Employee(1,"Mintu",10000,"IT"));
        empList.add(new Employee(2,"Vikas",12000,"IT"));
    }
    
    
    @Override
    public void addEmployee(Employee e) 
    {
        Employee obj = findEmployeeById(e.getId());
        if(obj==null)
        {
            empList.add(e);
            System.out.println("Employee added successfully");
        }
        else
        {
            System.out.println("Employee id already exists in list....");
        }
    }

    @Override
    public void updateEmployee(Employee e) 
    {
        Employee obj = findEmployeeById(e.getId());
        if(obj==null)
        {
            System.out.println("Employee does not exists... so cannot update");
        }
        else
        {
            empList.add(empList.indexOf(obj),e);
            empList.remove(obj);
            System.out.println("Employee updated successfully");
        }
    }

    @Override
    public void removeEmployee(Employee e) 
    {
        Employee obj = findEmployeeById(e.getId());
        if(obj==null)
        {
            System.out.println("Employee does not exists in list");
        }
        else
        {
            empList.remove(obj);
            System.out.println("Employee removed successfully");
        }
    }

    @Override
    public Employee findEmployeeById(int id) 
    {
        for(Employee e:empList)
        {
            if(e.getId()==id)
            {
                return e;
            }
        }
        return null;
    }

    @Override
    public void getAllEmployees() 
    {
        for(Employee e:empList)
        {
            System.out.println(e);
        }
    }

}
