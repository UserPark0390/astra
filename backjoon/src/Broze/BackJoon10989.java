//package Broze;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BackJoon10989 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int A [] = new int [N];
//		
//		for(int i = 0; i < N; i++) {
//			int num = sc.nextInt();
//			A[i] = num;
//		}
//		Arrays.sort(A);
//		
//		for(int i =0; i < N; i++) {
//			System.out.println(A[i]);
//		}
//		sc.close();
//	}
//}
package Broze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class BackJoon10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Scanner 사용시 시간초과 / 시간제한 Java 11: 3 초 / 메모리제한 Java 11: 512 MB // 시간 및 메모리 신경쓰기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int A [] = new int [N];
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			A[i] = num;
		}
		Arrays.sort(A);
		
		for(int i =0; i < N; i++) {
			bw.write(A[i] + "\n");
		}
		bw.flush();
	} // main end
}
