// Vivian Yee
// Period 2
// Project 1 Method Madness

public class VYeeLib {
	public static boolean isPalindrome(String word){
	    int x = 0, y = word.length() - 1; // Initialize counters
	    while (x < y) {
	        if (word.charAt(x) != word.charAt(y)) { // Compares letters
	            return false;
	        }else {
	        	x++; // Go to letter after
	        	y--; // Go to letter before
	        }
	    }
	    return true;
	}
	
	public static String cutOut(String mainStr, String subStr) {
		if(mainStr.indexOf(subStr)==-1){ // If subStr not in mainStr return mainStr
			return mainStr;
		}else {
			int x = mainStr.indexOf(subStr); // x is placeholder of index
			return(mainStr.substring(0, x)+mainStr.substring(x+subStr.length(),mainStr.length()));
		}
	}
	
	public static int sumUpTo(int x) {
		int z = 0; // Starts at 0
		for(int y = 0;y <= x; y++) {
			z = z + y; // Adds every number before integer x
		}
		return z;
	}
}


