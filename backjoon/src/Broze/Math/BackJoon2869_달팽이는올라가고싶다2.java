package Broze.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 시간초과
public class BackJoon2869_달팽이는올라가고싶다2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int count = 0;
		int oneday = 0;

		while (oneday < V) {
			if (oneday == 0) {
				oneday = A - B;
				count++;
			} else {				
				oneday = oneday + A;
				if(oneday >= V) {
					count++;
					break;
				} else {
					oneday -= B;
					count++;
				}
			}			
		}
		System.out.println(count);
	}
}
