package methodReferencingExample;

public class Main {

	public static void main(String[] args) {

		// WorkInterface workInterface = () -> System.out.println("doTask's
		// implementation by lambad expression");

		// IMP note: here by method reference we are provide implementation for
		// functional interface(doTask()), it's an alternative for lambda
		// expression/special type/compact lambda expression.

		// like above same Think can we do by using method referencing
		
		
		// static method ko refer kiya
		// clannName::staticMethodName
		WorkInterface workInterface = Stuff::doStuff;

		// referring non static method
		Stuff stuffObj = new Stuff();
		WorkInterface workInterface1 = stuffObj::doSomeStuff;

		workInterface.doTask();
		workInterface1.doTask();
	}
}
