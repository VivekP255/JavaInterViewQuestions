package programmingQuestions;

public class checkSubStringsHavingexactSum {

	public static void main(String[] args) {
		int[] a = { 1, 0, 7, 11, 15, 2, 3, 4, 5, 6, 1 };

		int sum = 0;
		int count = 0;
		int num = 7;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				sum = a[i] + a[j];

				if (sum == num) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
