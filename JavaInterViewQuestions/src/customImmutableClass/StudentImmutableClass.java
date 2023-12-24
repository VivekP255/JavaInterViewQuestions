package customImmutableClass;

import java.util.Date;
import java.util.Objects;

public final class StudentImmutableClass {

	private final String name;
	private final int rollNo;
	private final Date mutableDate;
	
	//don't provide setter method
	//getters
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public Date getDate() throws CloneNotSupportedException{
		//return new Date(mutableDate.getTime());
		return (Date) mutableDate.clone();
	}
	
	//constructor
	public StudentImmutableClass(String name, int rollNo, Date mutableDate) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.mutableDate = mutableDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mutableDate, name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentImmutableClass other = (StudentImmutableClass) obj;
		return Objects.equals(mutableDate, other.mutableDate) && Objects.equals(name, other.name)
				&& rollNo == other.rollNo;
	}


	
	
}
