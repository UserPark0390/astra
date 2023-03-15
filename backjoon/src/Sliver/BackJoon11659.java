package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BackJoon11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int A [] = new int [N+1];	
		st = new StringTokenizer(br.readLine());
		for(int k = 1; k <= N; k++) {
			A[k] = A[k-1]+Integer.parseInt(st.nextToken());
		} // for end
		
		for(int l = 0; l < M; l++){
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			bw.write(A[j]-A[i-1] + "\n");
		} // for end
		bw.flush();
	}
}
