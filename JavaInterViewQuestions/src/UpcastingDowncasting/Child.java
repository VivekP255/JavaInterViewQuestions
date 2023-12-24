package UpcastingDowncasting;

public class Child extends Parent {

	public void print() {
		System.out.println("CHILD");
	}

	public void child() {
		System.out.println("CHILD BUT NOT OVERIDDEN");
	}

	public static void main(String[] args) {
		// upcasting -> typecasting of child class object to parent class
		Parent upcasting = new Child();
		upcasting.print();
		upcasting.function();
		// upcasting.child() not accessible since in upcasting only specific methods
		// from child class is accessible(overridden).

//==========================================================================================================================================

		// downcasting -> typecasting parent class object reference to child class
		// object
		// we can not use it implicitly like,
		// Child downcasting=(Child) new Parent();
		// downcasting.funvtion(); It throws Exception in thread "main"
		// java.lang.ClassCastException: class UpcastingDowncasting.Parent cannot be
		// cast to class UpcastingDowncasting.Child (UpcastingDowncasting.Parent and
		// UpcastingDowncasting.Child are in unnamed module of loader 'app')
		// at UpcastingDowncasting.Child.main(Child.java:25)

		// downcasting is performed as,

		Parent P = new Child();
		Child downcasting = (Child) P;
		
		downcasting.child();
		downcasting.function();
		downcasting.print();
		
	}

}
