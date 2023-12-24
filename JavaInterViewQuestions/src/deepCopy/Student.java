package deepCopy;

public class Student implements Cloneable{

	int rollNO;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student st = (Student) super.clone(); //done shallow i.e. copied primitives
		Address add = (Address) address.clone();
		st.address = add;
		return st;
	}
	
	
}
