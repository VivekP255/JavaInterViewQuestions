package comparableVsComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentCompPOJO>{

	@Override
	public int compare(StudentCompPOJO o1, StudentCompPOJO o2) {
		return o1.getName().compareTo(o2.getName());
	}


}
