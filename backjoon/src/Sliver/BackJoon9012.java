package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BackJoon9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Character> stack = new Stack<>();
		
		int T = Integer.parseInt(st.nextToken());
		String str = "";
		char ch = ' ';
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			for(int j = 0; j < str.length(); j++) {
				ch = str.charAt(j);
				if(ch == '(') {
					stack.push(ch);
				} else if(ch == ')') {
					if(stack.isEmpty() == true) {
						stack.push(ch);
					} else if(stack.contains(')')){
						break;
					} else {
						stack.pop();
					}
				}
			} // for end
			if(stack.isEmpty() == true) {
				bw.write("YES" + "\n");
			} else {
				bw.write("NO" + "\n");
			}
			stack.clear();
		} // i for end
		bw.flush();
		br.close();
		bw.close();
	}
}
