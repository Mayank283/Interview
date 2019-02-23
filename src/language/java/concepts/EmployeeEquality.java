/**
 *
 */
package language.java.concepts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mayank
 *
 */
public class EmployeeEquality
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        Employee e1 = new Employee(1, "Mayank");
        Employee e2 = new Employee(1, "Mayank");
        //Employee e2 = new Employee(2,"Aseem");

        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(e1, "Employee1");
        map.put(e2, "Employee2");

        System.out.println(map);
    }
}

class Employee
{

    private int id;

    private String name;

    public Employee(int id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object object)
    {

        Employee employee = (Employee) object;

        if (this.id == employee.id && this.name == employee.name)
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 7 * hash + this.id;
        hash = 7 * hash + this.name.hashCode();
        return hash;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}