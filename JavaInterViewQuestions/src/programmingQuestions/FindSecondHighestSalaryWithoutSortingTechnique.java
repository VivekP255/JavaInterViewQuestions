package programmingQuestions;

public class FindSecondHighestSalaryWithoutSortingTechnique {

	public static void main(String[] args) {

//		int i, first, second;
//		first = second = Integer.MIN_VALUE;
//
//		int[] a = { 2, 5, 7, 1, 4, 9, 18, 17 };
//
//		for (i = 0; i < a.length; i++) {
//			if (a[i] > first) {
//				second = first;
//				first = a[i];
//
//			} else if (a[i] > second && a[i] != first) {
//				second = a[i];
//			}
//		}
//		
//		System.out.println("highest second value--->" + second);
//
//	}

		// third highest salary
		int i, first, second, third;
		first = second = third = Integer.MIN_VALUE;

		int[] a = { 2, 5, 7, 1, 4, 9, 18, 17 };

		for (i = 0; i < a.length; i++) {
			if (a[i] > first) {
				second = first;
				third = second;
				first = a[i];

			} else if (a[i] > second && a[i] != first) {
				second = a[i];
			}

			else if (a[i] > third && a[i] != second) {
				third = a[i];
			}
		}

		System.out.println("highest second value--->" + third);

	}

}
