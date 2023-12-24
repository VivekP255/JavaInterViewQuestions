package comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

	public static void main(String[] args) {
		
		StudentCompPOJO pojo = new StudentCompPOJO("Vivek", 21, "Parbhani", 100);
		StudentCompPOJO pojo1 = new StudentCompPOJO("Vishal", 15, "Hyderabad", 90);
		StudentCompPOJO pojo2 = new StudentCompPOJO("Akshay", 17, "Pune", 95);
		StudentCompPOJO pojo3 = new StudentCompPOJO("Chagan", 36, "Amsterdam", 35);
		StudentCompPOJO pojo4 = new StudentCompPOJO("Balaji", 100, "Deccan", 80);

		List<StudentCompPOJO> list = new ArrayList<StudentCompPOJO>();
		list.add(pojo1);
		list.add(pojo2);
		list.add(pojo3);
		list.add(pojo4);
		list.add(pojo);
		
		System.out.println("before sort--->"+ list);
		
		Collections.sort(list);
		System.out.println("After sort--->" + list);
		
	}
	
}
