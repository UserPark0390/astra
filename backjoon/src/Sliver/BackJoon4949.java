package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackJoon4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String str = "";
		char ch = ' ';
		int count = 0;

		while (true) {
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (ch == '.' && count == 0) {
					return;
				} else if (ch == '.' && count != 0) {
					if (stack.isEmpty() == true) {
						stack.clear();
						count = 0;
						System.out.println("yes");
						break;
					} else {
						stack.clear();
						count = 0;
						System.out.println("no");
						break;
					}
				}

				if (ch == '[' || ch == '(') {
					stack.push(ch);
					count++;
				} else if (ch == ']' || ch == ')') {
					if (stack.isEmpty() == true) {
						stack.push(ch);
						count++;
					} else {
						if ((stack.peek() == '[' && ch == ']') || (stack.peek() == '(' && ch == ')')) {
							stack.pop();
							count++;
						} else {
							stack.push(ch);
							count++;
						}
					}
				} else {
					count++;
					continue;
				}
			}
		} // while end
	}
}
