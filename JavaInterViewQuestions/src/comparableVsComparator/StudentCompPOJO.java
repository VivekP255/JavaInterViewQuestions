package comparableVsComparator;
//comparable uses single sorting sequence
//in order to use comparable, need to implement comparable interface and need to override comapareTo method in SOurce code(POJO)
//comparable does affect to source code(POJO)

public class StudentCompPOJO implements Comparable<StudentCompPOJO>{

	private String name;
	private int rollNo;
	private String city;
	private int percentage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public StudentCompPOJO(String name, int rollNo, String city, int percentage) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentCompPOJO [name=" + name + ", rollNo=" + rollNo + ", city=" + city + ", percentage=" + percentage
				+ "]";
	}
/*Comparable String Sorting
 * 	@Override

	public int compareTo(StudentCompPOJO o) {
		//Here this(current object is compare to object o which is passed in this method)
		/*positive integer, if the current object is greater than the specified object.
		negative integer, if the current object is less than the specified object.
		zero, if the current object is equal to the specified object.
		return this.getName().compareTo(o.getName());
		}*/
	
	
	
	@Override

	public int compareTo(StudentCompPOJO o) {
		//Here this(current object is compare to object o which is passed in this method)
//		positive integer, if the current object is greater than the specified object.
//		negative integer, if the current object is less than the specified object.
//		zero, if the current object is equal to the specified object.
		return this.getRollNo()-o.getRollNo();
		}
	}
	
	


