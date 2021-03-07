import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FirstDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 9, 8, 4, 4 };
		System.out.println(findFirstDuplicate(arr));

	}

	public static String findFirstDuplicate(int[] arr) {
		List<Integer> temp = new ArrayList<>();
		for (int i : arr) {
			if (temp.indexOf(i) != -1)
				return String.valueOf(i);
			else
				temp.add(i);
		}
		return null;
	}

	@Test
	public void testFindFirstDuplicate() {
		assertEquals(findFirstDuplicate(new int[] {}), null);
		assertEquals(findFirstDuplicate(new int[] { 1, 5, 9, 8, 4, 4 }), "4");
		assertEquals(findFirstDuplicate(new int[] { 8,2,3,0,3,6,2 }), "3");
		assertEquals(findFirstDuplicate(new int[] { 5,2,4,6,3,7,1 }), null);
		assertEquals(findFirstDuplicate(new int[] { 10,5,0,0,5,10 }), "0");
	}

}
