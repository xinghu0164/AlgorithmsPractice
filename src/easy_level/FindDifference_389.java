package easy_level;

/**
 * 
 * Given two strings s and t which consist of only lowercase letters.
 * 
 * String t is generated by random shuffling string s and then add one more
 * letter at a random position.
 * 
 * Find the letter that was added in t.
 * 
 * @author xinghu
 *
 */
public class FindDifference_389 {

	public static void main(String[] args) {
		FindDifference_389 fd = new FindDifference_389();
		System.out.println(fd.findTheDifference2("a", "aa"));

	}

	// runtime 59 ms beats 1.59%
	public char findTheDifference(String s, String t) {

		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();

		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (ss[j] == tt[i]) {
					tt[i] = '%';
					ss[j] = '#';
				}
			}
		}
		return String.valueOf(tt).replaceAll("%", "").charAt(0);
	}

	// a genius way in sample solutions
	// represent chars in number to get the sum for both string.
	// then get the subtraction to get the remain char.
	
	//runtime 8 ms  beats 57.43%
	public char findTheDifference2(String s, String t) {

		int cursChar = 0, curtChar = 0;
		for (int i = 0; i < t.length(); i++) {
			curtChar += (int)t.charAt(i);
		}
		for (int j = 0; j < s.length(); j++) {
			cursChar += (int)s.charAt(j);
		}
		return (char)(curtChar-cursChar);
	}
}
