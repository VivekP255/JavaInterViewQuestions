package coreJavaTrickyInterviewQuestions;

import java.io.IOException;

public class TryCatch {


	public static void main(String[] args) throws IOException {

		try {
			throw new IOException();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
// o/p - it won't work
}
