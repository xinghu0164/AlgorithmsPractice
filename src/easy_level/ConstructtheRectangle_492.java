package easy_level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * For a web developer, it is very important to know how to design a web page's
 * size. So, given a specific rectangular web page’s area, your job by now is to
 * design a rectangular web page, whose length L and width W satisfy the
 * following requirements:
 * 
 * 1. The area of the rectangular web page you designed must equal to the given
 * target area.
 * 
 * 2. The width W should not be larger than the length L, which means L >= W.
 * 
 * 3. The difference between length L and width W should be as small as
 * possible.
 * 
 * You need to output the length L and the width W of the web page you designed
 * in sequence. Example: Input: 4 Output: [2, 2] Explanation: The target area is
 * 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. But
 * according to requirement 2, [1,4] is illegal; according to requirement 3,
 * [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W
 * is 2.
 * 
 * 
 * @author xinghu
 *
 */
public class ConstructtheRectangle_492 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			System.out.print("输出"+Integer.parseInt(line));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    public int[] constructRectangle(int area) {
        
    	int base = (int) Math.sqrt(area);
    	while(area%base!=0){
    		base -= 1;
    	}
    	int[] re =  {base, area/base}; 
    	return re;
    }

}
