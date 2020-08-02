/*Write a program that will have a Vector which is capable of storing 
 * employee objects. Use an Iterator and enumeration to list all the 
 * elements of the Vector.
*/

package wipro.Assignments.List;

import java.util.Iterator;
import java.util.Vector;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Assignment7 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Manoj", "Ambedkar street, India", 20000.0));
		list.add(new Employee(102, "Sita", "Ramalayam street, India", 30000.0));
		list.add(new Employee(103, "Pooja", "Sita Nagar street, India", 25000.0));
		list.add(new Employee(104, "Dheeraj", "Bus stand centre, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
	}

}
