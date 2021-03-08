import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * 
1) Write an efficient algorithm to find the first duplicated integer in an array of integers
Input : arrrayA = {8, 2, 3, 0, 3, 6, 2}
Output : 3
Input : arrrayA = {5, 2, 4, 6, 3, 7, 1}
Output : null
Input : arrrayA = {10, 5, 0, 0, 5, 10}
Output : 0
 * */

public class FirstDuplicate {

	public static String findFirstDuplicate(int[] arr) {
		if (arr == null || arr.length <= 0)
			return null;
		List<Integer> temp = new ArrayList<>();
		for (int i : arr) {
			if (temp.indexOf(i) != -1)
				return String.valueOf(i);
			else
				temp.add(i);
		}
		return null;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 9, 8, 4, 4 };
		System.out.println(findFirstDuplicate(arr));

	}

	@Test
	public void testFindFirstDuplicate() {
		assertEquals(findFirstDuplicate(new int[] {}), null);
		assertEquals(findFirstDuplicate(null), null);
		assertEquals(findFirstDuplicate(new int[] { 1, 5, 9, 8, 4, 4 }), "4");
		assertEquals(findFirstDuplicate(new int[] { 8, 2, 3, 0, 3, 6, 2 }), "3");
		assertEquals(findFirstDuplicate(new int[] { 5, 2, 4, 6, 3, 7, 1 }), null);
		assertEquals(findFirstDuplicate(new int[] { 10, 5, 0, 0, 5, 10 }), "0");
	}

}
