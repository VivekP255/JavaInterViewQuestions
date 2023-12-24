
package leetcodePractice;

public class PallindromeNumber {
	
	public boolean isPalindrome(int x) {
        int sum = 0;
        int input = x;
        while(x>0)
        {
            int reminder = x%10;
            x = x/10;
            sum = (sum*10) + reminder;
        }
        if(sum == input)
        {
            return true;
        }
return false;
    }

	public static void main(String[] args) {

		PallindromeNumber m = new PallindromeNumber();
		m.isPalindrome(121);
	}

}
