package codility;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumber sn = new SingleNumber();
		int[] A = { 1, 1, 2, 2, 2, 3, 3 };
		System.out.println(sn.solution(A));
	}

	public int solution(int[] A) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int item : A) {
			if (!list.contains(item)) {
				list.add(item);
			} else {
				int index = list.indexOf(item);
				list.remove(list.get(index));
			}
		}
		return list.get(0);
	}

}
