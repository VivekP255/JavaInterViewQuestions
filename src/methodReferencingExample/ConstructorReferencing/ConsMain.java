package methodReferencingExample.ConstructorReferencing;

public class ConsMain {

	public static void main(String[] args) {
		System.out.println("Studying constructor referencing");

//		ProviderInterface providerInterface = () -> {
//			return new Student();
//		};

		//constructor referencing
		//class_Name::new
		ProviderInterface providerInterface = Student::new;

		Student student = providerInterface.getStudent();
		student.display();

	}
}
