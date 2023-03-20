package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BackJoon10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();

		int K = Integer.parseInt(st.nextToken());
		int value = 0;
		int result = 0;
		
		while(K-- > 0){
			st = new StringTokenizer(br.readLine());
			value = Integer.parseInt(st.nextToken());
			if(value != 0) {
				stack.push(value);
			} else if(value == 0) {
				stack.pop();
			}
		} // while end
		
		K = stack.size();
		
		for(int i = 0; i < K; i++) {
			result += stack.pop();
		}
		System.out.println(result);
	}
}
