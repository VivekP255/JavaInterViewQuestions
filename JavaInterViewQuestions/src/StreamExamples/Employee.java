package StreamExamples;

public class Employee {

	int id;
	int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	public Employee(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	
	

}
