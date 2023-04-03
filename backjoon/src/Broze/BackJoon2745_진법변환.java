package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon2745_진법변환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		
        // 어떤 진수든 10진수로 바꾸는 방법은 똑같다.
        // 각 자리의 10진수 숫자 * 진수의 각 자리수 제곱을 모두 더한 값이다.

        int result = 0;
        int tmp = 1;
        for (int i = N.length()-1; i >= 0; i--) {
            char ch = N.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
            	result += (ch - 'A' + 10) * tmp;
            } else {
            	result += (ch - '0') * tmp;
            }
            tmp *= B;       
            }
        System.out.println(result);
    }

}
