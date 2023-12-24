package customObjectAsKeyInHashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vivek
 *
 */
public class CustomObjectAsKeyInHashmap {

	public static void main(String[] args) {
		StudentPOJO s1 = new StudentPOJO("Vivek", 21, "Parbhani", 100);
		StudentPOJO s2 = new StudentPOJO("Vivek", 21, "Parbhani", 100);
		StudentPOJO s3 = new StudentPOJO("Vivek", 21, "Parbhani", 100);
		// 1) override equals() and hashcode() in custom class
		//before overriding equals() and hashcode() in POJO, it shows s1 is not equal to s2 because by default equals method checks equality on the basis of reference(==), The default implementation provided by the JDK is based on memory location — two objects are equal if and only if they are stored in the same memory address.
		//and there hashcode is also diff. 
		//after overriding equals() and hashcode() in POJO, it shows s1 is equal to s2 and there hashcode is also same as per contract. 
		System.out.println(s1.equals(s2)); //berfore-->false, after--> true
		System.out.println(s1.hashCode() + "===" +s2.hashCode());//berfore-->1101288798===942731712, after-->-1970961082===-1970961082
		
		
		HashMap<StudentPOJO, String> map = new HashMap<StudentPOJO, String>();
		map.put(s1, "one");
		map.put(s2, "two");
		map.put(s3, "three");
		
		//before overriding equals() and hashcode() in POJO, it stored all obj, s1, s2, s3 at diff index since hashcode is diff of all 3Objects
		//, so it returns
		//key== StudentCompPOJO [name=Vivek, rollNo=21, city=Parbhani, percentage=100]  value==two
		//key== StudentCompPOJO [name=Vivek, rollNo=21, city=Parbhani, percentage=100]  value==three
		//key== StudentCompPOJO [name=Vivek, rollNo=21, city=Parbhani, percentage=100]  value==one
		for(Map.Entry<StudentPOJO, String> entry:map.entrySet()) {
			System.out.println("key== "+ entry.getKey() + "  value==" +entry.getValue());
		}

		
		// 2) make cuatome class immutable 
		//if it is mutable then, we can set some other values in the object and doing so is changing it's hashcode
		System.out.println(s2.hashCode());// before setting(changing object's field) hashcode is -1970961082
		s2.setName("Vishal");
		System.out.println(s2.hashCode());// after setting(changing object's field) hashcode is 1837784432
		
		// Key and value is placed in index->4 once hashcode changed, so it will calculate wrong index as per hashcode e.g 11
		//it may give null/wrong key when you try to get with same object as key since it's  hashcode so index changed. 
		//so that's why we need to make class as immutable. 
		
		
		
	}
}
