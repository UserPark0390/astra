package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BackJoon1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(st.nextToken());
		int value = 0;
		int number = 1;

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			value = Integer.parseInt(st.nextToken());
			while (number <= value) {
				stack.push(number);
				bw.write("+" + "\n");
				number++;
			}
			if (value == stack.peek()) {
				stack.pop();
				bw.write("-" + "\n");
			}
		}
		if (stack.isEmpty() != true) {
			System.out.println("NO");
			return;
		} else {
			bw.flush();
			bw.close();
		}
	}
}
