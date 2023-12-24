package customObjectAsKeyInHashmap;

import java.util.Objects;

//Object of this class will be the key in HashMap
//make a class immuatable as well, for understanding purpose of hashmap class i haven't made immuatable for now.
public class StudentPOJO {

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

	public StudentPOJO(String name, int rollNo, String city, int percentage) {
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

	// overriding hashcode() and equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPOJO other = (StudentPOJO) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name) && percentage == other.percentage
				&& rollNo == other.rollNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, name, percentage, rollNo);
	}
//
	//what happen if we only override equals() / hashcode()? - refer - https://medium.com/@pulapaphani/why-overriding-equals-and-hashcode-in-java-b5f869f985d2#:~:text=Since%20the%20default%20hashCode%20implementation,be%20placed%20in%20another%20bucket.  

	//if we only override equals method, effect on hashmap - it stored all obj, s1, s2, s3 at diff index since hashcode is diff of all 3Objects
	//if we only override hashcode method, effect on hashmap - it stored all obj, s1, s2, s3 at same bucket since equals() returns false for all 3Objects in case of hashcollision

}
