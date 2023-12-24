package coreJavaTrickyInterviewQuestions;

public class Inheritance extends parent {

	@Override
	public void print() {
		System.out.println("Print Method from Child class");
	}

	public static void main(String[] args) {

		Inheritance inheritance = new Inheritance();
		inheritance.print(); // should call from child

		parent parents = new parent();
		parents.print(); // should call method from parent class

		parent p = new Inheritance();
		p.print(); // should call from child

	}

}
