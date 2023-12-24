package finalVsImmutable;

public class main {

	public static void main(String[] args) {

		//in final, we can not change it' reference, We can not reassign value
		final int a = 10;
		//this is not allowed
		//in final, we can not reassign diff obj ref to that ref. variable;
		//final int a = 20;
		
		int b=5;
		int c=6;
		int d=7;
		 b=c+d;
		 
		 System.out.println(b);
		
		//In Immutable, we can not change it's actaul value but we can change/reassign value
		String s = "Vivek";
		s.concat("Pawar");
		//here original value is not changed
		System.out.println(s);
		
		//but we can reassign the value to the ref.
		s = s.concat("Pawar");
		System.out.println(s);

	}

}


