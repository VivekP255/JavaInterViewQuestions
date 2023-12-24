package customImmutableClass;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Date date = new Date();
		date.setDate(16);
		StudentImmutableClass s = new StudentImmutableClass("Vivek", 21, date);
		System.out.println("Name-->"+s.getName()+"  RollNo-->"+s.getRollNo()+"  Date-->"+s.getDate());
		System.out.println(s.hashCode());
		s.getDate().setDate(21);
		System.out.println("Name-->"+s.getName()+"  RollNo-->"+s.getRollNo()+"  Date-->"+s.getDate());
		System.out.println(s.hashCode());

	}

}
