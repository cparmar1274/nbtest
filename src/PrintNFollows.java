import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrintNFollows {

	public static void main(String[] args) {
		System.out.println(printNFollow(5, 'a', "") + printNFollow(5, 'b', ""));
	}

	private static String printNFollow(int n, char c, String str) {
		if (n <= 0)
			return str;
		str += c;
		return printNFollow(--n, c, str);
	}

	@Test
	public void testPrintNFollows() {
		assertEquals(printNFollow(5, 'a', "")+printNFollow(5, 'b', ""), "aaaaabbbbb");
		assertEquals(printNFollow(2, 'a', ""), "aa");
		assertEquals(printNFollow(1, 'a', ""), "a");
		assertEquals(printNFollow(-1, 'a', ""), "");
		
	}
}
