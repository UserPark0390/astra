package Broze;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
 
public class BackJoon9093 {
    public static void main(String[] args) throws IOException{
    	// StringBuilder시 메모리 초과, Scanner + Stack 사용시 시간초과 
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // testcase
 
        while (T-- > 0) {
            Stack<Character> stack = new Stack<>(); // 스택을 이용한 출력
            String str = br.readLine() +"\n";
            for (char ch : str.toCharArray()) { // 문자열 하나씩 쪼개서
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch); 
                }
                else stack.push(ch);
            }
        }
        bw.flush(); // 버퍼를 비워내고 동시에 출력
    }
}