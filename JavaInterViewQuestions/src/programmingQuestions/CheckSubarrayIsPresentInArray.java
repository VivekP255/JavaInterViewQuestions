package programmingQuestions;

public class CheckSubarrayIsPresentInArray {
	static boolean flag;

	public static void main(String[] args) {

		int[] a = { 11, 15, 2, 3, 4, 5, 6 };
		int[] b = { 3, 4, 5 };

		int aLength = a.length;
		int bLength = b.length;

		int i = 0;
		int j = 0;

		while (i < aLength && j < bLength) {
			if (a[i] == b[j]) {
				i++;
				j++;

				if (j == bLength) {
					flag = true;
					int start = i - bLength;
					int end = i-1;
					System.out.println(i +" "+bLength);
					System.out.println("start--->" + start + " end--->" + end);
					
				} else {
					flag = false;
				}
			}

			else {
				i = i - j + 1;
				j = 0;
			}
		}

		if (flag == true) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
