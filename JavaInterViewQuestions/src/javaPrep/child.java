package javaPrep;

abstract class parent {
	public void print()
	{
		System.out.println("called from Parent Class ");
	}
	
	//public abstract void abstrcatCall();
}

public class child extends parent{

	public void print()
	{
		System.out.println("called from child class");
	}
	
	public static void main(String[] args)
	{
		parent  in = new child();
		in.print();
	}


}