package comparableVsComparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<StudentCompPOJO>{

	@Override
	public int compare(StudentCompPOJO o1, StudentCompPOJO o2) {
		return o1.getRollNo()-o2.getRollNo();
	}

}
