import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Write a method that takes in an integer N as input and prints N a’s followed by N b’s.
i.e. if N=5, print aaaaabbbbb
Note - Try writing the solution without using any loop structures
 * */

public class PrintNFollows {

	private static String printNFollow(int n, char c, String str) {
		if (n <= 0)
			return str;
		str += c;
		return printNFollow(--n, c, str);
	}

	public static void main(String[] args) {
		System.out.println(printNFollow(5, 'a', "") + printNFollow(5, 'b', ""));
	}

	@Test
	public void testPrintNFollows() {
		assertEquals(printNFollow(5, 'a', "") + printNFollow(5, 'b', ""), "aaaaabbbbb");
		assertEquals(printNFollow(2, 'a', ""), "aa");
		assertEquals(printNFollow(1, 'a', ""), "a");
		assertEquals(printNFollow(-1, 'a', ""), "");

	}
}
