package CustomeException;

//it is always recommended to extend the RuntimeException class, 
//so we don't need to handle it by try-catch block/ not to use throws.
public class customException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public customException(String message) {
		super(message);
	}

}
