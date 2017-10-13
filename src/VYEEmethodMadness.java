// Vivian Yee
// Period 2
// Project 1 Method Madness

public class VYEEmethodMadness {
	public static void main(String []args) {
		isPalindrome("whatatw");
		cutOut("butterfly","butter");
		sumUpTo(5);
	}
	public static boolean isPalindrome(String word){
	    int x = 0, y = word.length() - 1;
	    while (x < y) {
	        if (word.charAt(x) != word.charAt(y)) {
	        	System.out.println("false"); // I couldn't see the return statement in the console,
	            return false;			   // So I just printed it out to make sure it was working.
	        }else {
	        	x++;
	        	y--;
	        }
	    }
	    System.out.println("true"); // Same here as before.
	    return true;
	}
	public static void cutOut(String mainStr, String subStr) {
		int x = 0, y = 0, z = 0, count = 0;
		while(x < mainStr.length()) {
			if(subStr.charAt(y)==mainStr.charAt(x)) {
				while(y<=subStr.length()) {
					if(subStr.charAt(y)==mainStr.charAt(z)) {
						z++;
						y++;
						count++;
					}else {
						break;
					}
				}
				if(count==subStr.length()) {
					mainStr = mainStr.replaceFirst(subStr," ");
					System.out.print(mainStr);
				}
			}
			x++;
			z++;
		}
	}
	public static int sumUpTo(int x) {
		int z = 0;
		for(int y = 0;y <= x; y++) {
			z = z + y;
		}
		System.out.print(z); // I couldn't see the return statement in the console,
		return z;			// So I just printed it out to make sure it was working.
	}
}


