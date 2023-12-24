package unrreachableCatchBlock;

import java.io.IOException;

public class UnreachableCatchBlock {

	public static void main(String[] args) throws Exception  {
		try {
			int i = Integer.parseInt("12");
			throw new IOException();
		} 
		catch (NumberFormatException e) {
			// TODO: handle exception
			throw e;
		}
		catch (Exception e) {
			System.out.println("Inside Exception catch block");
			throw e;
		}
		
	}
}
