// Vivian Yee
// Period 2
// Project 1 Method Madness

public class VYeeLib {
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
	public static String cutOut(String mainStr, String subStr) {
		return  "string";
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


