package task1;

import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		Stack<E> re = new Stack<E>();
		for (int i = 0; i < array.length; i++) {
			re.push(array[i]);
		}
		int index = 0;
		while (!re.isEmpty()) {
			array[index++] = re.pop();
		}
	}

	// This method checks the correctness of the given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==> false
	public static boolean isCorrect(String input) {
		if (input == null || input.isEmpty())
			return true;
		Stack<Character> re = new Stack<Character>();
		for (int i = 0; i < input.length(); ++i) {
			char c = input.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				re.push(c);
			} else if (re.isEmpty()) {
				return false;
			} else if (re.peek() == '(' && c == ')' || re.peek() == '[' && c == ']' || re.peek() == '{' && c == '}') {
				re.pop();
			} else {
				return false;
			}
		}
		return re.isEmpty();
	}

	// This method evaluates the value of anexpression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		// TODO
		return 0;
	}
	public static String insertBlanks(String input) {
		String re = "";
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/' ||
					input.charAt(i) == '(' || input.charAt(i) == ')' ) {
				re = re + " " + input.charAt(i) + " ";
			} else {
				re = re + " " + input.charAt(i);
			}	
		}
		return re;
	}
}
