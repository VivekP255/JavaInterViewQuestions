package CustomeException;

public class testCustomException {

	public void validateAge(int age) {
		if (age < 18) {
			throw new customException("Your age is below 18, Can't proceed");
		}
	}

	public static void main(String[] args) {

		testCustomException tce = new testCustomException();
//		try {
//			tce.validateAge(17);
//			System.out.println("Age validated, You can proceed!");
//		} catch (customException e) {
//			// It's not necessary to throw exception in catch block, I do not see point in
//			// catching the exception and throwing it again
//			System.out.println("in catch" + e);
//		}

		 tce.validateAge(17);

	}

}
