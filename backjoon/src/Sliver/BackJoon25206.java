package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon25206 {
	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			List<String> list = new ArrayList<>();
			double count = 0; // 학점의 총합
			double avg = 0; // 전공평점
			for(int i = 0; i < 20; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				double score = 0; // 학점
				double Grade = 0; // 과목평점
				list.add(st.nextToken());
				score = Double.parseDouble(st.nextToken());
				String G = st.nextToken();
				if(!G.equals("P")) {
					switch (G) {
					case "A+":
						Grade = 4.5;
						break;
					case "A0":
						Grade = 4.0;
						break;
					case "B+":
						Grade = 3.5;
						break;
					case "B0":
						Grade = 3.0;
						break;
					case "C+":
						Grade = 2.5;
						break;
					case "C0":
						Grade += 2.0;
						break;
					case "D+":
						Grade += 1.5;
						break;
					case "D0":
						Grade += 1.0;
						break;
					case "F":
						Grade += 0.0;
						break;
					} // switch end
					count += score;
					avg += score*Grade;
				}
			}
			String result = String.format("%.6f", avg/count);
			System.out.print(result);
			
		}
		
		
	}
}
