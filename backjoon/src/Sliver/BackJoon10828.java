package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class BackJoon10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = Integer.parseInt(st.nextToken());
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			 switch (str) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(stack.isEmpty() == true) {
					bw.write(-1 + "\n");
				} else {
					bw.write(stack.pop() + "\n");
				}
				break;
			case "size":
				bw.write(stack.size() + "\n");
				break;
			case "empty":
				if(stack.isEmpty() == true) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
				break;
			case "top":
				if(stack.isEmpty() == true) {
					bw.write(-1 + "\n");
				} else {
					bw.write(stack.peek() + "\n");
				}
				break;
			}
		} // while end
		bw.flush();
		br.close();
		bw.close();
	}
}
