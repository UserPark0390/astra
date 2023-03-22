package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BackJoon1764_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < N + M; i++) {
			st = new StringTokenizer(br.readLine());
			if (i < N) {
				map.put(st.nextToken(), 1);
			} else {
				String str = st.nextToken();
				if(map.keySet().contains(str)){
					map.put(str , 2);
				}
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				list.add(entry.getKey());
			}
		}
		bw.write(list.size() + "\n");
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
