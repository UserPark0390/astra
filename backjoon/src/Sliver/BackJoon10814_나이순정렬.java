package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BackJoon10814_나이순정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		String [][] A = new String [N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			A[i][0] = st.nextToken();
			A[i][1] = st.nextToken();
		}
		
		Arrays.sort(A, new Comparator<String[]>() {

			@Override
			public int compare(String o1[], String o2[]) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});	
		for(int i = 0; i < N; i++) {
			System.out.println(A[i][0] + " " + A[i][1]);
		}
		
	}
}
