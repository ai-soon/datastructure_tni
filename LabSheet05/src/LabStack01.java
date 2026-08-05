import java.util.Scanner;
import java.util.Stack;

public class LabStack01 {
	public static void main(String[] args) {
		String tc1 = "SUM([A1+B1]*{C1-D1})";
		String tc2 = "IF((a>0, [b*2)], c)";
		String tc3 = "Hello ((world)";
		String tc4 = "Malee (2613510002)";

		System.out.println("Testcase 1 = " + (isBalance(tc1) ? "Balance" : "Not Balance"));
		System.out.println("Testcase 2 = " + (isBalance(tc2) ? "Balance" : "Not Balance"));
		System.out.println("Testcase 3 = " + (isBalance(tc3) ? "Balance" : "Not Balance"));
		System.out.println("Testcase 4 = " + (isBalance(tc4) ? "Balance" : "Not Balance"));
	}

	public static boolean isBalance(String message) {
		// write your code here to check the balance and correctness of the parentheses

		StackArrayBased stacks = new StackArrayBased(message.length());
		boolean isBalance = true; // Assume the parentheses is balance

		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i); // Get each character in message
			if (letter == '(' || letter == '[' || letter == '{') {
				stacks.push(letter);
			} else if (letter == ')' || letter == ']' || letter == '}') {
				if (letter == ')') {
					if (stacks.check('(')) {
						stacks.pop();
					} else {
						isBalance = false;
						break;
					}
				} else if (letter == '}') {
					if (stacks.check('{')) {
						stacks.pop();
					} else {
						isBalance = false;
						break;
					}
				} else if (letter == ']') {
					if (stacks.check('[')) {
						stacks.pop();
					} else {
						isBalance = false;
						break;
					}
				}
			}
 
		}
		if (!stacks.isEmpty()) {
			isBalance = false;
		}
		return isBalance;
	}
}