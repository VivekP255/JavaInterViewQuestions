package shallowCopy;

public class Student implements Cloneable{

	int rollNO;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
