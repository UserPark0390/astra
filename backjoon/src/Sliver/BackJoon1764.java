package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<String> N_list = new ArrayList<>();
		List<String> M_list = new ArrayList<>();

		for (int i = 0; i < N + M; i++) {
			st = new StringTokenizer(br.readLine());
			if (i < N) {
				N_list.add(st.nextToken());
			} else {
				M_list.add(st.nextToken());
			}
		}
			
		N_list.retainAll(M_list);
		bw.write(N_list.size() + "\n");
		Collections.reverse(N_list);
	
		for(int i = 0; i < N_list.size(); i++) {
			bw.write(N_list.get(i) + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
