package Broze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		List<Integer>list = new ArrayList<>();
	
		for(int i = 0; i < C; i++) {
			int sum = 0;
			int avg = 0;
			double ratio = 0;
			String result = "";
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			for(int j = 0; j < N; j++) {
				list.add(Integer.parseInt(st.nextToken()));
				sum += list.get(j);
			}
			avg = sum/N;
			for(int j = 0; j < list.size(); j++) {
				if(avg < list.get(j)) {
					ratio++;
				}
			} // for end
			list.clear();
			result = String.format("%.3f",((ratio/N*100)));
			bw.write(result + "%" + "\n");
			bw.flush();
		}
		br.close();
	}
}
