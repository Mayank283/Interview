/**
 * 
 */
package codemonk.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mayank
 *
 */
public class EmployeeEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee e1 = new Employee(1,"Mayank");
		Employee e2 = new Employee(1,"Mayank");
		//Employee e2 = new Employee(2,"Aseem");
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(e1, "Employee1");
		map.put(e2, "Employee2");
		
		System.out.println(map);
	}
}